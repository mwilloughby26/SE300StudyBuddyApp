import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginGUI extends Application {
	private BorderPane topPane = new BorderPane();
	private SplashPaneGUI splashPane = new SplashPaneGUI();
	private AppMenuGUI appPane = new AppMenuGUI();
	private Button LoginBtn = new Button("LOGIN");

	private Stage mainStage;

	public void start(Stage primaryStage) {

		LoginBtn.setOnAction(e -> {
			
			topPane.setCenter(appPane);
			
		});
		
		splashPane.setLoginBTN(LoginBtn);
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
