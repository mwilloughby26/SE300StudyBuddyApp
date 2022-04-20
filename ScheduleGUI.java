import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ScheduleGUI extends BorderPane{
	//Internal panes
	private Button backButton = new Button("Back");
	private Pane schedulerPane = new SchedulerPane(backButton);
	//private Button exitSchedulerButton = new Button("Main Menu");
	
	public ScheduleGUI() {
		this.setPrefSize(800, 600);
		this.setCenter(schedulerPane);
		
		
		this.backButton.setOnAction(e -> {
		AppMenuGUI appMenu = new AppMenuGUI();
		this.getChildren().clear();
		this.setCenter(appMenu);
		});
	}
}
