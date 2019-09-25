package chapter10.circle_test2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML Circle circle;
	@FXML AnchorPane anc;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(anc.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(anc.heightProperty(), 2));

	}

}
