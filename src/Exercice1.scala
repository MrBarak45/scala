class Exercice1 {
  def egaux(a: List[Int], b: List[Int]): Boolean = {
    if

    def equalAux (xs: List[Int], value: Int): Boolean = {
      xs match {
        case Nil => true
        case x :: xs if x == value => equalAux(xs, x)
        case x :: _ if x != value => false
      }
    }
  }

  def min(a: List[Int]): Int = {
    if(a.isEmpty) throw new java.lang.IllegalArgumentException
    if (a.size == 1)
      a.head
    else{
      val minTail = min(a.tail)
      if(minTail < a.head) minTail
      else a.head
    }
  }

  def isPrime(a :Int) : Boolean = {
    def isPrimeHelper(n:Int, i:Int) : Boolean = {
      if (n <= 2)
        if (n == 2) return true else return false

      if (n % i == 0)
        return false
      if (i * i > n)
        return true

      isPrimeHelper(n, i + 1)
    }

    isPrimeHelper(a, 2)
  }

}

class Exercice2 {

  sealed trait Liste[+A]

  case class NonVide[+A](tete: A, queue: Liste[A]) extends Liste[A]

  object Vide extends Liste[Nothing]

  def apply[A](first: A, others: A*): Liste[A] = {



  }

  def concat(list: Liste[A]): Liste[A] = {


  }





}