import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class Reminders_FXML_Controller implements Initializable {
    @FXML
    private TextField textFieldSubject;

    @FXML
    private TextArea textAreaWords;

    @FXML
    private TextField textFieldName;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void save(){
        Reminders stuff = new Reminders(textFieldSubject.getText(),textAreaWords.getText(),textFieldName.getText());
        try {
            FileWriter fw = new FileWriter("Reminders.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(textFieldSubject.getText()+"\n"+textAreaWords.getText()+"\n"+textFieldName.getText()+"\n\n");
            bw.close();
        }catch (Exception e) {
            System.err.println("Error");
            e.getMessage();
        }
    }
}
