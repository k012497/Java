package chapter10.container_box;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

public class Test extends Application{

	public Test() {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> CONSTRUCTOR");
	}
	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call start()");
		
		HBox hBox = new HBox();
		hBox.setPrefHeight(100);
		hBox.setPrefWidth(500);
		hBox.setSpacing(20);
		hBox.setAlignment(Pos.CENTER);
		
		TextField textField = new TextField();
		textField.setPrefWidth(400);
		
		Button button = new Button();
		button.setText("EXIT");
		button.setOnAction(e -> Platform.exit());
		
		ObservableList<Node> list = hBox.getChildren();
		list.add(textField);
		list.add(button);

		Scene scene =new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void init() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call init()");
		
		Parameters ps = getParameters();
		
		List<String> list = ps.getRaw();
		for (String string : list) {
			System.out.println(string);
		}
		
		
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" " + value);
		}

		
		}
	@Override
	public void stop() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(">> call stop()");
	}
	

}
