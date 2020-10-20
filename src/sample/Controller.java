package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class Controller {
    @FXML
   private TextField name;
    @FXML
    private TextField family;
    @FXML
    private TextField otchestvo;
    @FXML
    private TextField nameFail;
    @FXML
    private TextField pathFile;
    @FXML
    private Label textWindow;
    String course= "";
    String pressradio = "";


    @FXML
    public void presscheck(ActionEvent event) {
        course += " " + ((CheckBox)event.getSource()).getText();

    }
    @FXML
    public void pressRadio(ActionEvent event){
         pressradio = ((RadioButton)event.getSource()).getText();

    }
    Module module = new Module();
    @FXML
 public void pressRegistr(ActionEvent event)throws IOException {
        module.createFile(course,pressradio,name.getText(),family.getText(),otchestvo.getText(),nameFail.getText(),pathFile.getText());
     textWindow.setText(name.getText() + "Вы зарегистрированы: ");
     textWindow.getText();
    }

}
