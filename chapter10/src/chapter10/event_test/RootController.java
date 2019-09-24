package chapter10.event_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	// 멤버변수 선언 - 화면에서 설계한 모든 객체를 여기서 선언해야 한다.
	@FXML private Label label; //부여한 id와 똑같은 이름을 써야 함 (id에 변수명을 부여해야 함)
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	
	// start에서 이벤트 처리하듯이 여기서 처리 한다.
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { //이벤트 정의 
		// 이벤트 처리 1, 임시객체
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				label.setText(button1.getText());
			}
		});
		
		// 이벤트 처리 2, 람다식 
		button2.setOnAction((e) -> label.setText(button2.getText()));
		
	}
	
	// 이벤트 처리 3, 직접
	public void handlerButton3Action(ActionEvent e) {
		label.setText(button3.getText());
	}
	

}
