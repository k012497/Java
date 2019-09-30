package chapter10.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		
	}

	public void handlerMenuItemNewAction() {
		textArea.appendText("new \n");
	}
	public void handlerMenuItemOpenAction() {
		textArea.appendText("open \n");
	}
	public void handlerMenuItemSaveAction() {
		textArea.appendText("save \n");
	}
	public void handlerMenuItemExitAction() {
		textArea.appendText("exit \n");
	}
}
