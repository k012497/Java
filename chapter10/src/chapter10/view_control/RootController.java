package chapter10.view_control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1. ListView 항목 삽입, property 이벤트 처리 
		insertListViewItemAndEventProcess();
		
		//2. TableView항목 삽입, property 이벤트 처리 
		insertTableviewItemAndEventProcess();
			
	}// end of initialize

	private void insertTableviewItemAndEventProcess() {
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		tableViewData.add(new Phone("IPhone4", "phone01.png"));
		tableViewData.add(new Phone("IPhone5", "phone02.png"));
		tableViewData.add(new Phone("IPhoneSE", "phone03.png"));
		tableViewData.add(new Phone("IPhone6", "phone04.png"));
		tableViewData.add(new Phone("IPhone6s", "phone05.png"));
		tableViewData.add(new Phone("IPhone7", "phone06.png"));
		tableViewData.add(new Phone("IPhone8", "phone07.png"));
		//listView.setStyle("-fx-alignment: CENTER);");
		
		//3. match with Table columns
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		//tcSmartPhone.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		//tcImage.setStyle("-fx-alignment: CENTER;");
	
		tableView.setItems(tableViewData);
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone phone) {
				Image imageData = new Image(getClass().getResource("images/" + phone.getImage()).toString());
				imageView.setImage(imageData);

			}
		});
		
		ObservableList<String> listViewData = FXCollections.observableArrayList();
		listViewData.add("IPhone4");
		listViewData.add("IPhone5");
		listViewData.add("IPhoneSE");
		listViewData.add("IPhone6");
		listViewData.add("IPhone6s");
		listViewData.add("IPhone7");
		listViewData.add("IPhone8");
		
		listView.setItems(listViewData);
				//인덱스로 할 거라서 제네릭타입 Number
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});
				
	}//end of insertTableviewItemAndEventProcess

	private void insertListViewItemAndEventProcess() {

	}

	public void handlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}

	public void handlerButtonOkAction(ActionEvent e) {
		String data = listView.getSelectionModel().getSelectedItem();
		System.out.println("선택된 스마트폰 = " + data);
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("선택된 테이블뷰는 " + phone.toString());
	}// end handlerCheckBoxAction
}
