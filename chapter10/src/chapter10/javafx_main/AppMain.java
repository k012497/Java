package chapter10.javafx_main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;
/*
 * JavaFX Life-cycle
 */
public class AppMain extends Application { // 1. Application 상속

	// 생성자 호출
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + " calls CONSTRUCTOR");
		System.out.println("Default constructor :) ");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "- main thread");
		launch(args); // 2. main에서 launch()실행
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "- start thread");
		System.out.println("call start()"); // 2-2. start() 호출
		primaryStage.setTitle("💜🍎🍍🍒🖤");
		primaryStage.show(); // 3. show
	}

	// 생성자 호출
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + "- init thread");
		System.out.println("call init()"); // 2-1. init() 호출

		Parameters ps = getParameters();
		List<String> list = ps.getRaw();
		for (String value : list) {
			System.out.println(value);
		}

		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
	}

	@Override
	public void stop() throws Exception { // 창을 닫으면 stop()호출
		System.out.println(Thread.currentThread().getName() + "- stop thread");
	}

}
