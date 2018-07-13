package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;//указываем id из sample
    @FXML
    TextField textField;

   public void sendMsg(){
       textArea.appendText(textField.getText()+"\n"); //передаем текст  из окна ввода сообщения в обший чат
       textField.clear();//очищаем окно ввода сообщений
       textField.requestFocus();//текстовый фокус остается на окне ввода сообщений

   }
}
