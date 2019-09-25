package chapter10.button_tools;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private CheckBox chkGlasses;
	@FXML private CheckBox chkHat;
	@FXML private RadioButton rdoBubble;
	@FXML private RadioButton rdoBar;
	@FXML private RadioButton rdoArea;
	@FXML private ImageView imgPerson;
	@FXML private ImageView imgChart;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void handlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}

	public void handlerCheckBoxAction(ActionEvent e) {
		if(chkHat.isSelected() && chkGlasses.isSelected()) {
			imgPerson.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if (chkHat.isSelected()) {
			imgPerson.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		} else if (chkGlasses.isSelected()) {
			imgPerson.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else {
			imgPerson.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}
}
