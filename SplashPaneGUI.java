import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SplashPaneGUI extends Pane {
   Button LoginButton;
   
  public void splashPane() {    
	    
  }
  
  public void setLoginBTN( Button NewButton ) {
	  LoginButton = NewButton;
	  LoginButton.setMinWidth(100);
	  LoginButton.setMinHeight(50);
	  LoginButton.setLayoutX(350);
	  LoginButton.setLayoutY(400);
	  LoginButton.setStyle("-fx-background-color: #FFFFFF");
	  LoginButton.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
	  getChildren().add(LoginButton);
  }
  

	public void setLogoImage() {
		Image image = new Image("img/LOGO.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(200);
		imageView.setY(0);
	    imageView.setFitHeight(500);
	    imageView.setFitWidth(500);
	    getChildren().add(imageView);
  }

}
