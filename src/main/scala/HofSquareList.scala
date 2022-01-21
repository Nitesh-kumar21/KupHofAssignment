class HofSquareList {
  def squareList(list: List[Int]): List[Int] =
    list match {
      case List() => list
      case listHead :: listTail => (listHead * listHead) :: squareList(listTail)
    }


  def squareListUsingMap(xs: List[Int]): List[Int] =
    xs map (listElement => listElement * listElement)


}
