package chapter10.hbox_test;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/*
 * TextField
 */
public class AppMain extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Root Container
		HBox hBox = new HBox();
		hBox.setPrefHeight(50);
		hBox.setPrefWidth(375);
		hBox.setAlignment(Pos.CENTER); // Pos : Positioning
		hBox.setSpacing(20);
		
		// 2. 컨트롤러(TextField, Button)
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("OK");
		button.setOnAction((e)-> Platform.exit()); //버튼에 이벤트 처리 (setOn~)
		
		// 3. 루트 컨테이너에 컨트롤러를 집어넣는다.
		ObservableList<Node> list = hBox.getChildren(); //Node : Controller
		list.add(textField);
		list.add(button);
		
		ObservableList<Node> l = hBox.getChildren();
		
		// 4. 루트 컨테이너를 Scene에 넣는다.
 		Scene scene = new Scene(hBox);
 		
 		// 5. stage에 scene을 집어넣는다.
 		primaryStage.setScene(scene);
 		primaryStage.show();
	}
}