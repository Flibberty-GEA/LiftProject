package code.snippet

import net.liftweb._
import http._
import util.Helpers._
//import net.liftweb.util.Helpers._
//import net.liftweb.http.SHtml
import net.liftweb.http.js.JsCmds.Alert

/**
  * @author yevgen
  */
class Snippet {

  def form_elements = {
    var textValue: String = ""
    var selectValue: String = ""

    def process() {
//      println(textValue)
//      println(selectValue)
//      Alert("алерт клиенту, что то успешно сохранено в базу")
      println("сохраняем "+textValue+" в базу на сервере")
      println("сохраняем "+selectValue+" в базу на сервере")
//      Alert("алерт клиенту, что то успешно сохранено в базу")
    }

    // SHtml.onSubmit - привязывает к определнному элементу формы функцию, которая будет вызываться на сервере при сабмите формы. Функция принимает значение поля и делает с ним какую-либо логику.
    "#textField" #> SHtml.onSubmit(value => textValue = value) &
      "#selectField" #> SHtml.onSubmit(value => selectValue = value) &
//      "#hidden" #> SHtml.onSubmitUnit(process) // hidden элемент нужен для вызова функции process()
      "#hidden" #> SHtml.onSubmitUnit(process) //
  }
}
