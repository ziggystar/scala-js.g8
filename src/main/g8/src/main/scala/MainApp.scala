import org.scalajs.dom
import dom.{ document, window }

object MainApp{

  def main(args: Array[String]): Unit = {
    println("Starting '$name$'...")

    val p = document.createElement("p")
    val text = document.createTextNode("Hello!")
    p.appendChild(text)
    document.body.appendChild(p)
  }

}
