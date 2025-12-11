package migke.todo

import org.scalajs.dom.*

@main def main(): Unit = {
  val list = createInto("ul")(document.body)
  val input = createInto("input")(document.body).asInstanceOf[HTMLInputElement]
  val button =
    createInto("button")(document.body).asInstanceOf[HTMLButtonElement]

  button.innerText = "add"
  button.onclick = { (e) =>
    createInto("li")(list).innerText = input.value
    input.value = ""
  }

}
def createInto(childName: String)(parent: Element) = {
  val child = document.createElement(childName)
  parent.appendChild(child)
  child
}
