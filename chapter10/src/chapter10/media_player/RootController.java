package chapter10.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {

	@FXML
	private MediaView mediaView;
	@FXML
	private ImageView imageView;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnStop;
	@FXML
	private Button btnPause;
	@FXML
	private Slider sliderVolume;
	@FXML
	private ProgressBar progressBar;
	@FXML
	private ProgressIndicator progressIndicator;
	@FXML
	private Label labelTime;
	private boolean endOfMedia;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media(getClass().getResource("media/video.m4v").toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);

		mediaPlayer.setOnReady(() -> {
			//미디어 플레이어의 현재시간이 변경될 때마다 property시간값을 알려줌. 이벤트 처리.
			mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
				@Override
				public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
						Duration newValue) {
					double timeData = mediaPlayer.getCurrentTime().toSeconds()
							/ mediaPlayer.getTotalDuration().toSeconds();
					progressBar.setProgress(timeData);
					progressIndicator.setProgress(timeData);
					
					labelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds()
							+"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"s");
				}
			});

			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);

			// 준비상태에서 자동으로 진행된다면 지금은 미디어뷰를 보이지 말라
			if (mediaPlayer.isAutoPlay()) {
				mediaView.setVisible(false);
			}
		});

		mediaPlayer.setOnPlaying(() -> {
			// 진행 시 play비활성화, pause활성화 , stop활성화
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnStopped(() -> {
			mediaPlayer.seek(mediaPlayer.getStartTime());
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});

		mediaPlayer.setOnEndOfMedia(() -> {
			endOfMedia = true; // 끝이 되면 endOfMedia값 변경
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
			
			labelTime.setText("Done");
		});

		// 볼륨 설정 
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
			}
		});

		sliderVolume.setValue(50.0);

		// 버튼 ActionEvent 처리
		// Play버튼 눌렀을 때
		btnPlay.setOnAction(event -> {
			if (endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime()); // 끝났으면 시작 위치로 돌아가기
			}
			mediaPlayer.play();
			endOfMedia = false;
		});

		// Pause버튼 눌렀을 때
		btnPause.setOnAction(event -> mediaPlayer.pause());
		// Stop버튼 눌렀을 때
		btnStop.setOnAction(event -> mediaPlayer.stop());

	}// end of initialize

	public void handlerButtonExitAction() {

	}

}
