package chapter10.button_tools;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ImageView imgPerson;
	@FXML private ImageView imgChart;
	@FXML private CheckBox chkGlasses;
	@FXML private CheckBox chkHat;
	@FXML private RadioButton rdoBar;
	@FXML private RadioButton rdoBubble;
	@FXML private RadioButton rdoArea;
	
	@Override
	   public void initialize(URL arg0, ResourceBundle arg1) {
//	       group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//	
//	         @Override
//	         public void changed(ObservableValue<? extends Toggle> arg0, Toggle oldValue, Toggle newValue) {
//	            
//	            Image image = new Image(getClass().getResource("images/"+newValue.getUserData().toString()+".png").toString());
//	            imgChart.setImage(image);
//	         }
//	      });
	   }
	   
	   public void handlerButtonExitAction(ActionEvent e) {
	      Platform.exit();
	   }
	   
	   public void handlerCheckBoxAction(ActionEvent e) {
	      if(chkGlasses.isSelected() && chkHat.isSelected()) {
	         imgPerson.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
	      }else if(chkGlasses.isSelected()) {
	         imgPerson.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
	      }else if(chkHat.isSelected()) {
	         imgPerson.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
	      }else {
	         imgPerson.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
	      }
	   }//end handlerCheckBoxAction 
	   
	   public void handlerRadioButtonAction(ActionEvent e) {
	      Image image = null;
	      if(rdoBubble.isSelected()) {
	         image = new Image(getClass().getResource("images/"+rdoBubble.getUserData().toString()+".png").toString());
	      }else if(rdoBar.isSelected()) {
	         image = new Image(getClass().getResource("images/"+rdoBar.getUserData().toString()+".png").toString());
	      }else {
	         image = new Image(getClass().getResource("images/"+rdoArea.getUserData().toString()+".png").toString());
	      }
	      
	      imgChart.setImage(image);
	      
	   }//end handlerRadioButtonAction
}
