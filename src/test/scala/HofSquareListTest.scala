import org.scalatest.flatspec.AnyFlatSpec

class HofSquareListTest extends AnyFlatSpec {
  val obj = new HofSquareList
  val list = List(2, 5, 7)
  "condition" should "give the empty list if the input list is empty" in {
    val result = List()
    assert(obj.squareList(result) == List())
  }
  "condition" should "give the square of the given list" in {
    val result = List(2, 3, 5)
    assert(obj.squareList(result) == List(4, 9, 25))
  }


}
