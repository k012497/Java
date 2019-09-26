package chapter10.input_controls;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private PasswordField password;
	@FXML private ComboBox<String> comboBox; 
	@FXML private DatePicker datePicker;
	@FXML private TextField txtTitle;
	@FXML private TextArea txtArea;
	@FXML private Button btnSave;
	@FXML private Button btnCancel;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//1. 콤보박스에 항목 입력하기. 
		//ArrayList<String> list2 = new ArrayList<String>();와 같은 것인데 UI버젼으로 쓴 
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("public");
		list.add("private");
		comboBox.setItems(list);
		
		comboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				txtArea.setText(txtArea.getText() + newValue);
			}
		});
		
		btnSave.setOnAction((event)->{
				String titleData = txtTitle.getText();
				String passwordData = password.getText();
				String comboBoxData = comboBox.getValue();
				LocalDate localDate = datePicker.getValue();
				String localDateData = localDate.toString();
				
				txtArea.setText(titleData + " " + passwordData + " " + comboBoxData + " " + localDateData + " " + localDateData);
		});
		
		
	}//end of initialize
	
	public void handlerButtonExitAction() {
		txtArea.setText(null);
	}

}
