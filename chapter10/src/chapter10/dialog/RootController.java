package chapter10.dialog;

import java.io.File;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	public Stage primaryStage;
	
	@FXML HBox hBox;
	private String string = " ah~~~";
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 못 가져오니까 에러 
		//Stage stage = (Stage) hBox.getScene().getWindow(); 
		
	} // end of initialize

	public void handleOpenFileChooser() {
		// 1. open FileChooser(Stage, Scene, Root Container)
		FileChooser fileChooser = new FileChooser();

		// 확장자 기능 부여 
		fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("textFile", "*.txt"),
			new ExtensionFilter("imageFile", "*.jpg", "*.png", "*.jpeg"),
			new ExtensionFilter("videoFile", "*.mp4"),
			new ExtensionFilter("allFile", "*.*"));
		
		
		// 2. 주인 스테이지 할당 (fileChooser스테이지 할당)
		Stage stage = (Stage) hBox.getScene().getWindow();
		File file = fileChooser.showOpenDialog(primaryStage); // 서로 다른 클래스의 primaryStage어떻게 가져올까?
		if(file != null) {
			System.out.println(file.getPath());
		}
	}

	//파일저장 다이얼로그창 활성화
	public void handleSaveFileChooser() {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("allFile", "*.*"));
		
		File file = fileChooser.showSaveDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}

	}

	//디렉토리 정보를 져오는 다이얼로그 창 가져오기 
	public void handleDirectoryChooser() {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File file = directoryChooser.showDialog(primaryStage);
		if(file != null) {
			System.out.println(file.getPath());
		}
	}

	//
	public void handlePopup() {
		Popup popup = new Popup(); // Stage는 있는데 RootContainer가 없다. 루컨역할을하는 popup.fxml을 가져온다
		HBox hBox = null;
		try {
			hBox = FXMLLoader.load(getClass().getResource("popup.fxml"));
			//ui객체를 찾아서 저장시키는 방법 
			
			ImageView imageView = (ImageView) hBox.lookup("#imageView");
			Label label = (Label) hBox.lookup("#label");
			label.setText(string);
			imageView.setOnMouseClicked(e-> {
					popup.hide();
			});
			popup.getContent().add(hBox); //scene에 루트 컨테이너 넣어줌
			popup.show(this.hBox.getScene().getWindow());
		
			popup.setAutoHide(true);//팝업창을 사라지게 하는 방법
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//사용자 정의 창 

	public void handleCustom() throws IOException {
		// 창 스타일 5개중 선택 
		Stage stage = new Stage(StageStyle.UTILITY);
		
		// modal / modaless 선택
		stage.initModality(Modality.WINDOW_MODAL);
		
		// 부모스테이지 세팅
		stage.initOwner(hBox.getScene().getWindow());
		 
		// title 설정 
		stage.setTitle("서브창입니다 ");
		stage.setResizable(false);
		
		// Root Container 가져오기
		AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		
		
		// UI객체를 찾고 이벤트 걸고 처리방식 정의
		TextField textFieldKor = (TextField) anchorPane.lookup("#textFieldKor");
		TextField textFieldEng = (TextField) anchorPane.lookup("#textFieldEng");
		TextField textFieldMath = (TextField) anchorPane.lookup("#textFieldMath");
		Button btnOK = (Button) anchorPane.lookup("#btnOK");
		Button btnClear = (Button) anchorPane.lookup("#btnClear");
		
		btnOK.setOnAction(e1-> {
			int sum = Integer.parseInt(textFieldKor.getText()) 
			+Integer.parseInt(textFieldEng.getText()) 
			+Integer.parseInt(textFieldMath.getText());
			
			System.out.println("total score is " + sum);
		});
		
		btnClear.setOnAction(e2-> {
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMath.setText("");
		});
		
		// Scene 만들기
		Scene scene = new Scene(anchorPane);
		stage.setScene(scene);
		stage.show();
	}

}
