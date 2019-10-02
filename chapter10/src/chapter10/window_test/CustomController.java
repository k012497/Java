package chapter10.window_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class CustomController implements Initializable {
	@FXML private AnchorPane anc1;
	@FXML private Button btnMain;
	@FXML private Button btnSum;
	@FXML private Button btnAvg;
	@FXML private Button btnClear;
	@FXML private TextField textFieldKor;
	@FXML private TextField textFieldEng;
	@FXML private TextField textFieldMat;
	@FXML private TextField textFieldSum;
	@FXML private TextField textFieldAvg;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction((e)->{
			handleButtonLoginAction(e);
		});
		
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
	}

	private void handleButtonLoginAction(ActionEvent e) {
		StackPane root = (StackPane) btnMain.getScene().getRoot(); //StackPane 값만 얻어와서 
		root.getChildren().remove(anc1); //루트컨테이너 넣어버리기 
	}
	
}
