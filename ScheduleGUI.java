import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ScheduleGUI extends BorderPane{
	
	BorderPane centerPane = new BorderPane();
	
	private ScheduleController controller = new ScheduleController();
	
	//Internal panes
	private EventHandlerPane eventHandlerPane = new EventHandlerPane();
	private CalanderPane calanderPane = new CalanderPane();
	private VBox exitPane = new VBox();
	
	//private Button exitSchedulerButton = new Button("Main Menu");
	
	public ScheduleGUI() {
		centerPane.setLeft(eventHandlerPane);
		centerPane.setRight(calanderPane);
		
		
		Button backBTN = new Button("BACK");
		backBTN.setStyle("-fx-background-color: #FFFFFF");
		backBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		backBTN.setTranslateX(300);
		backBTN.setTranslateY(0);
		
		eventHandlerPane.getChildren().addAll(backBTN);
		
		backBTN.setOnAction(e -> {
			AppMenuGUI appMenu = new AppMenuGUI();
			this.setCenter(appMenu); 
		});
		
		this.setMaxSize(800, 600);
		this.setCenter(centerPane);
		
	}
}
