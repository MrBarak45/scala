sealed trait Article

case class Regular(name: String, category: String, price: Double) extends Article

// discount est compris entre 0 et 1
case class Discounted(name: String, category: String, price: Double, discount: Float) extends Article



def isDiscounted(article: Article): Boolean =  {
  article match{
    case _: Discounted => return true
  }

  false
}

def discountedItems(articles: List[Article]): List[Discounted] = {
  articles.filter(isDiscounted).asInstanceOf[List[Discounted]]
}

//def regularItems(articles: List[Article]): List[Regular] = {
//  //articles.filterNot(isDiscounted).asInstanceOf[List[Regular]]
//  articles.collect {
//    case _: Regular => _
//  }
//}

def regularItems(articles: List[Article]): List[Regular] =
  articles.collect { case r: Regular => r }

def applyDiscount(article: Discounted): Double = {
  article.price - (article.price * article.discount)
}

def cartAmount(articles: List[Article]): Double =
  articles.map(article => article match {
  case a: Regular => a.price
  case b: Discounted => b.price
  }).reduce((a, b) => a + b)

def applyCoupon(coupon: Float, category: String) = {


}


