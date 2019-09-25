package chapter10.javafx_test1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	
	@FXML private Label lblText;
	@FXML private Slider sldSize;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sldSize.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				lblText.setFont(new Font(newValue.doubleValue()));
			}
			
		});
		
		
	}

}
