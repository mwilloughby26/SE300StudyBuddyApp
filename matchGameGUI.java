import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class matchGameGUI extends BorderPane{
	
	Pane centerPane = new Pane();
	
	public matchGameGUI() {
		
		Button backBTN = new Button("BACK");
		backBTN.setStyle("-fx-background-color: #FFFFFF");
		backBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		backBTN.setTranslateX(25);
		backBTN.setTranslateY(15);
		
		centerPane.getChildren().addAll(backBTN);
		this.setCenter(centerPane); 
		
		backBTN.setOnAction(e -> {
			StudyGUI appMenu = new StudyGUI();
			this.setCenter(appMenu);
			
		});  
		
	}
	
}