package chapter10.textarea_text3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML Button btn1;
	@FXML Button btn2;
	@FXML TextArea txt1;
	@FXML TextArea txt2;
	@FXML Label lbl1;
	@FXML Label lbl2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(txt1.textProperty(), txt2.textProperty());

	}
	
	public void handlerButtonAction () {

	}

}
