
def sum(tree: Tree): Int = tree match {
  case Node(left, right) => sum(left) + sum(right)
  case Leaf(value) => value
}

def isSame(tree1: Node, tree2:Node): Boolean = {

  if (tree1.data != tree2.data ||
    tree1.left.isEmpty != tree2.left.isEmpty ||
    tree1.right.isEmpty != tree2.right.isEmpty) {
      false
  }
  else if (tree1.left.exists(a => tree2.left.exists(b => !same(a,b)))) false
  else !tree1.right.exists(a => tree2.right.exists(b => !same(a,b)))


}

def mirror(tree: Node): Unit = {

  if (tree == None){
    return
  }

  else{
    temp = tree

    mirror(tree.left)
    mirror(tree.right)

    var temp = tree.left
    tree.left = tree.right
    tree.right = temp
  }

}
