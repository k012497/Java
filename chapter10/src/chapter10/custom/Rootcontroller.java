package chapter10.custom;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Rootcontroller implements Initializable {

	@FXML
	HBox hBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleCustom() throws IOException {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		
		AnchorPane ap = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		
		TextField textFieldKor = (TextField) ap.lookup("#textFieldKor");
		TextField textFieldEng = (TextField) ap.lookup("#textFieldEng");
		TextField textFieldMat = (TextField) ap.lookup("#textFieldMat");
		TextField textFieldSum = (TextField) ap.lookup("#textFieldSum");
		TextField textFieldAvg = (TextField) ap.lookup("#textFieldAvg");
		Button btnSum = (Button) ap.lookup("#btnSum");
		Button btnAvg = (Button) ap.lookup("#btnAvg");
		Button btnClear = (Button) ap.lookup("#btnClear");
		
		btnSum.setOnAction((event)-> {
			int sum = Integer.parseInt(textFieldKor.getText())
					+ Integer.parseInt(textFieldEng.getText())
					+ Integer.parseInt(textFieldMat.getText());
			textFieldSum.setText(sum+"");
		});
		
		btnAvg.setOnAction((event)-> {
			int sum = Integer.parseInt(textFieldKor.getText())
					+ Integer.parseInt(textFieldEng.getText())
					+ Integer.parseInt(textFieldMat.getText());
			double avg = sum / 3.0;
			textFieldAvg.setText(avg+"");
		});
		
		
		btnClear.setOnAction((event)-> {
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMat.setText("");
			textFieldSum.setText("");
			textFieldAvg.setText("");
			
		});
		
		Scene scene = new Scene(ap);
		stage.setScene(scene);
		stage.show();
	}

}
