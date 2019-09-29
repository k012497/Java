package chapter10.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnStop;
	@FXML private Button btnPause;
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media(getClass().getResource("media/video.m4v").toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.setOnReady(()-> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			
			// 준비상태에서 자동으로 진행된다면 지금은 미디어뷰를 보이지 말라 
			if(mediaPlayer.isAutoPlay()) {	mediaView.setVisible(false); }
		});
		
		mediaPlayer.setOnPlaying(() ->{
			//진행 시 play비활성화,  pause활성화 , stop활성화 
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnPaused(() ->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnStopped(()->{
			mediaPlayer.seek(mediaPlayer.getStartTime());
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		
		mediaPlayer.setOnEndOfMedia(() ->{
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		
		//버튼 ActionEvent 처리
		//Play버튼 눌렀을 때 
		btnPlay.setOnAction(event ->{
			mediaPlayer.play();
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
			}
			mediaPlayer.play(); endOfMedia = false;
		});
		
		//Pause버튼 눌렀을 때 
		btnPause.setOnAction(event -> mediaPlayer.pause());
		//Stop버튼 눌렀을 때
		btnStop.setOnAction(event -> mediaPlayer.stop());
		
	}//end of initialize
	
	public void handlerButtonExitAction() {
		
	}

}
