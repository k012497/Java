package chapter10.root_container;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/*
 * Label
 */
public class AppMain extends Application {

	public static void main(String[] args) { 
		launch(); //정적메소드에서는 this를 찾으면 안 됨 
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Root Container
		VBox vBox = new VBox();
		vBox.setPrefHeight(300);
		vBox.setPrefWidth(600);
		vBox.setAlignment(Pos.CENTER); // Pos : Positioning
		vBox.setSpacing(20);
		
		// 2. 컨트롤러(Label, Button)
		Label label = new Label();
		label.setText("Hello JavaFX");
		label.setFont(new Font(80));
		
		Button button = new Button();
		button.setText("EXIT");
		button.setOnAction((e)-> Platform.exit()); //버튼에 이벤트 처리 (setOn~)
		
		// 3. 루트 컨테이너에 컨트롤러를 집어넣는다.
		ObservableList<Node> list = vBox.getChildren(); //Node : Controller
		list.add(label);
		list.add(button);
		
		// 4. 루트 컨테이너를 Scene에 넣는다.
 		Scene scene = new Scene(vBox);
 		
 		// 5. stage에 scene을 집어넣는다.
 		primaryStage.setScene(scene);
 		primaryStage.show();
	}


}
