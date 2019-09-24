package chapter10.anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
 * add fxml
 */
public class AppMain extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Root Container
		// 2. 컨트롤러(TextField, Button)
		// 3. 루트 컨테이너에 컨트롤러를 집어넣는다.
		Parent hBox = FXMLLoader.load(getClass().getResource("root.fxml"));
		
	
		// 4. 루트 컨테이너를 Scene에 넣는다.
 		Scene scene = new Scene(hBox);
 		
 		// 5. stage에 scene을 집어넣는다.
 		primaryStage.setScene(scene);
 		primaryStage.setResizable(false); //창크기 고정 
 		primaryStage.show();
	}
}