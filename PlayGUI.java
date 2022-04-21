import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PlayGUI extends BorderPane{
	
	Pane centerPane = new Pane();
	
	public PlayGUI() {
		
		Button backBTN = new Button("BACK");
		backBTN.setStyle("-fx-background-color: #FFFFFF");
		backBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		backBTN.setTranslateX(25);
		backBTN.setTranslateY(15);
		
		Button RacerBTN = new Button("Racer");
		RacerBTN.setStyle("-fx-background-color: #FFFFFF");
		RacerBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		RacerBTN.setTranslateX(50);
		RacerBTN.setTranslateY(30);
		
		Button froggerBTN = new Button("Frogger");
		RacerBTN.setStyle("-fx-background-color: #FFFFFF");
		RacerBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		RacerBTN.setTranslateX(75);
		RacerBTN.setTranslateY(45);
		
		centerPane.getChildren().addAll(backBTN);
		this.setCenter(centerPane); 
		
		backBTN.setOnAction(e -> {
			AppMenuGUI appMenu = new AppMenuGUI();
			this.setCenter(appMenu);
			
		});  
		
		RacerBTN.setOnAction(e -> {
			reward_racer RacerObj = new reward_racer();
			// RacerObj.start(null);
			this.setCenter(RacerObj);
		});
		
		froggerBTN.setOnAction(e -> {
			reward_frogger froggerObj = new reward_frogger();
			this.setCenter(froggerObj);
		});
	}
	
}
