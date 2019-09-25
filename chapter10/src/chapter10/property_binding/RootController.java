package chapter10.property_binding;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML private TextArea txtSend;
	@FXML private TextArea txtReceive;
	@FXML private Button btnBind;
	@FXML private Button btnUnBind;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		txtReceive.textProperty().bindBidirectional(txtSend.textProperty());//센드 값이 바뀔때마다 리시브에서 받아준다.
		
//		txtSend.setOnKeyReleased(new EventHandler<Event>() {
//			@Override
//			public void handle(Event event) {
//				int count = txtSend.getLength();
//				String data = txtSend.getText(count - 1, count); //한 글자씩 가져오기 
//				String targetData = txtReceive.getText();
//				txtReceive.setText(targetData + data);
//			}
//		});
		 
	
//		Bindings.bindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
		
		//bind bidirectional
		btnBind.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Bindings.bindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
			}
		});
		
		//unbind
		btnUnBind.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Bindings.unbindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
			}
		});

	}

}
