package lists
sealed abstract class RList[+T]{
  def head: T
  def tail: RList[T]
  def isEmpty: Boolean
}

case object RNil extends RList[Nothing] {
  override def head:Nothing = throw new NoSuchElementException
  override def tail: RList[Nothing] = throw new NoSuchElementException
  override def isEmpty: Boolean = true
}
object ListProblems extends App {

  println("checking")
}
