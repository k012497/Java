package chapter10.button_tools;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//1. root container
		//2. Scene
		//3. Stage
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml")); //xml에 로드되어서 자체적으로 객체가 만들어짐. id를 체크하고 루트컨트롤러 불러 변수 매칭시킴. 그리고 이니셜라이즈함수 자동실행.  
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		//primaryStage.setResizable(false);
		primaryStage.setTitle("💜🍎🍍🍒🖤");
		primaryStage.show();
		
	}
}
