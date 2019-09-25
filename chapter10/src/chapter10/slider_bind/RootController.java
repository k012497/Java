package chapter10.slider_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private Slider sldSize;
	@FXML private Label lblText;
	
//	private int count;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sldSize.valueProperty().addListener(new ChangeListener<Number>(){
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				lblText.setFont(new Font(newValue.doubleValue()));
			}
		});
		
//		sldSize.setOnMouseDragged(new EventHandler<Event>() {
//			@Override
//			public void handle(Event event) {
//				count++;
//				System.out.println(count + " ");
//				lblText.setFont(new Font(sldSize.getValue()));	
//			}
//		});
		
	}

}
