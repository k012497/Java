package chapter10.test;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	
	public LifeCycle() {
		System.out.print(Thread.currentThread().getName());
		System.out.println(" >> CONSTRUCTOR");
	}

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(" >> call start()");
		primaryStage.setTitle("TEST");
		primaryStage.show();
	}

	@Override
	public void init() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(" >> call init()");
	}
	
	@Override
	public void stop() throws Exception {
		System.out.print(Thread.currentThread().getName());
		System.out.println(" >> call stop()");
	}
}
