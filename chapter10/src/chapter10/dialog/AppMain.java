package chapter10.dialog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
//	public static Stage primaryEH;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1번 방법 
		//controller도 쓰려고 두 줄으로 분리 
		//Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = fxmlLoader.load();
		RootController rootController = fxmlLoader.getController();
		rootController.primaryStage = primaryStage;
		
		// 정적변수 사용 방법 
//		primaryEH = primaryStage;
//		HBox root = (HBox)FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("💜 TEST 💜");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
