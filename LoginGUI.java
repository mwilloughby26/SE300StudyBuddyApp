import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginGUI extends Application {
	private BorderPane topPane = new BorderPane();
	private SplashPaneGUI splashPane = new SplashPaneGUI();
	private AppMenuGUI appPane = new AppMenuGUI();
	private Button LoginBtn = new Button("LOGIN");
	private Button SubmitBtn = new Button("SUBMIT");
	private Button quitBTN = new Button("X");
	private CanvasIntegration canvasAPI = new CanvasIntegration(" ");
	TextField token = new TextField();
	Label directionLbl = new Label("Directions: \n->Go To Canvas Login\n ->Go To Settings "
			+ "\n->Scroll Down \n->Click +New Access Token\n ->Copy and Paste it into the text box");
	

	private Stage mainStage;

	public void start(Stage primaryStage) {

		LoginBtn.setOnAction(e -> {
		
			directionLbl.setWrapText(true);
			directionLbl.setMaxWidth(225);
			directionLbl.setLayoutX(100);
			directionLbl.setLayoutY(400);
			splashPane.getChildren().add(directionLbl);
			
			token.setTranslateX(300);
			token.setTranslateY(400);
			token.setMinWidth(250);
			token.setPromptText("TOKEN:");
			splashPane.getChildren().add(token);
			
			LoginBtn.setVisible(false);
			
			SubmitBtn.setTranslateX(375);
			SubmitBtn.setTranslateY(450);
			SubmitBtn.setStyle("-fx-background-color: #FFFFFF");
			SubmitBtn.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			splashPane.getChildren().add(SubmitBtn);
			
		});
		
		SubmitBtn.setOnAction(e -> {
			if(token.getText().length() < 20) {
				Label inputLbl = new Label("Please Enter Your Valid Token In The Box");
				inputLbl.setTranslateX(350);
				inputLbl.setTranslateY(360);
				inputLbl.setStyle("-fx-text-fill: red;");
				splashPane.getChildren().add(inputLbl);
				
			}else {
				canvasAPI.setToken(token.getText());
				topPane.setCenter(appPane);
			}
			
		});
		
		quitBTN.setOnAction(e -> {
			
			primaryStage.close();
			
		});
		
		splashPane.setLoginBTN(LoginBtn,quitBTN);
		splashPane.setLogoImage();
		
		topPane.setStyle("-fx-background-color: lightblue");
		
		Scene scene = new Scene(topPane, 800, 600);
		
		topPane.setCenter(splashPane);
		
		primaryStage.setTitle("StudyBuddy");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Stage getMainStage() {
		return mainStage;
	}

// Only here for environments that don't directly support the start() method
	public static void main(String[] args) {
		launch(args);
	}
}
