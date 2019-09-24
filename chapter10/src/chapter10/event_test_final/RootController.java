package chapter10.event_test_final;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable{
	
	@FXML private Label label;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				label.setText(button1.getText());
			}
		});
		
		button2.setOnAction((e) -> {
				label.setText(button2.getText());
		});
	}
	
	public void handlerButton3Action() {
		label.setText(button3.getText());
	}

}
