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
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {
	@FXML private Button btn1;
	@FXML private Button btn2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction((e)->{
			handleButtonWindow1Action(e);
		});
		
		btn2.setOnAction((e)->{
			handleButtonWindow2Action(e);
		});
	}

	public void handleButtonWindow1Action(ActionEvent e) {
		try {
			//root.fxml에 있는 최상위 루트 컨테이너 객체 값을 가져온다. 
			StackPane root = (StackPane) btn1.getScene().getRoot();
			//login.fxml을 로더하고 최상위 루트 컨테이너 객체 값을 가져온다.
			Parent login = FXMLLoader.load(getClass().getResource("custom.fxml"));
			root.getChildren().add(login);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void handleButtonWindow2Action(ActionEvent e) {
		try {
			//root.fxml에 있는 최상위 루트 컨테이너 객체 값을 가져온다. 
			StackPane root = (StackPane) btn1.getScene().getRoot();
			//login.fxml을 로더하고 최상위 루트 컨테이너 객체 값을 가져온다.
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			root.getChildren().add(login);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
