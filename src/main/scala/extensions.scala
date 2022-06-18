import scala.scalajs.js
import scala.scalajs.js.Dictionary

object extensions {

  implicit class JsArrayExtension[T](val xs: js.Array[T]) extends AnyVal {
    def groupByDictionary(f: T => String): Dictionary[js.Array[T]] = {
      val dict = js.Dictionary.empty[js.Array[T]]
      for (x <- xs) { dict.getOrElseUpdate(f(x), js.Array()).push(x) }
      dict
    }
  }

}
