package chapter10.window_test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable {
	@FXML AnchorPane anc2;
	@FXML private Button btnMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction((e)->{
			handleButtonLoginAction(e);
		});
	}

	private void handleButtonLoginAction(ActionEvent e) {
		StackPane root = (StackPane) btnMain.getScene().getRoot(); //StackPane 값만 얻어와서 
		root.getChildren().remove(anc2); //루트컨테이너 넣어버리기 
	}
	
}
