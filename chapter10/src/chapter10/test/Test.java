package chapter10.test;

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


public class Test extends Application{
	//함수 처리 되는 것들은 멤버변수로 
	public Boolean flag = false;
	public Label label;
	
	public Test() {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> CONSTRUCTOR");
	}

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call start()");
		
		VBox vBox = new VBox();
		vBox.setPrefWidth(300);
		vBox.setPrefHeight(200);
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(20);
		
		label = new Label();
		label.setText("HELLO");
		label.setAlignment(Pos.CENTER);
		label.setFont(new Font(20));
		label.setPrefHeight(90);
		label.setPrefWidth(400);
		
		Button button = new Button();
		button.setText("EXIT");
		//button.setOnAction(e->Platform.exit());
		button.setOnAction(e -> handlerAction(e));
		
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);
		
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void handlerAction(ActionEvent e) {
		if(flag) {					
			label.setText("HELLO");
			label.setFont(new Font(20));
		}else {
			label.setText("HELLO!");
			label.setFont(new Font(30));
		}
		flag = !flag;
	}

	@Override
	public void init() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call init()");
	}

	@Override
	public void stop() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call stop()");
	}
}
