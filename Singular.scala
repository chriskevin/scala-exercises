class Singular[A](element: A) extends Traversable[A] {
  override def foreach[B](f: A => B): Unit = f(element)
}