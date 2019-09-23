package chapter10.test;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Test extends Application{
	
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
		vBox.setPrefWidth(100);
		vBox.setPrefHeight(500);
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(20);
		
		Label label = new Label();
		label.setText("HELLO");
		label.setAlignment(Pos.CENTER);
		label.setPrefHeight(90);
		label.setPrefWidth(400);
		
		Button button = new Button();
		button.setText("EXIT");
		button.setOnAction(e->Platform.exit());
		
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);
		
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
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
