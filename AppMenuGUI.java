import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AppMenuGUI extends BorderPane{
	
	Pane centerPane = new Pane();
	StudyGUI studyMenuPane = new StudyGUI();
	ScheduleGUI schedulePane = new ScheduleGUI();
	PlayGUI playMenuPane = new PlayGUI();
	
	public AppMenuGUI() {
		
		Button scheduleBTN = new Button("SCHEDULE");
		scheduleBTN.setStyle("-fx-background-color: #FFFFFF");
		scheduleBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		scheduleBTN.setTranslateX(100);
		scheduleBTN.setTranslateY(250);
		
		Button studyBTN = new Button("STUDY");
		studyBTN.setStyle("-fx-background-color: #FFFFFF");
		studyBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		studyBTN.setTranslateX(350);
		studyBTN.setTranslateY(250);
		
		Button playBTN = new Button("PLAY");
		playBTN.setStyle("-fx-background-color: #FFFFFF");
		playBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		playBTN.setTranslateX(550);
		playBTN.setTranslateY(250);
		
		Button logoutBTN = new Button("LOGOUT");
		logoutBTN.setStyle("-fx-background-color: #FFFFFF");
		logoutBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		logoutBTN.setTranslateX(25);
		logoutBTN.setTranslateY(15);
		
		centerPane.getChildren().addAll(scheduleBTN,studyBTN,playBTN,logoutBTN);
		this.setCenter(centerPane);
		
		studyBTN.setOnAction(e -> {
			
			this.setCenter(studyMenuPane);
			
		});

		scheduleBTN.setOnAction(e -> {
		
			this.setCenter(schedulePane);
	
		});

		playBTN.setOnAction(e -> {
	
			this.setCenter(playMenuPane);
	
		});
		
		logoutBTN.setOnAction(e -> {
			
			SplashPaneGUI loginPane = new SplashPaneGUI();
			Button LoginBtn = new Button("LOGIN");
			loginPane.setLoginBTN(LoginBtn);
			loginPane.setLogoImage();
			this.setCenter(loginPane);
			
			LoginBtn.setOnAction(r -> {
				
				AppMenuGUI appPane = new AppMenuGUI();
				this.setCenter(appPane);
				
			});
			
		});

		
	}
	
}