import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CalanderPane extends VBox {
	
	private Label sundayLabel = new Label("Sunday");
	private Label mondayLabel = new Label("Monday");
	private Label tuesdayLabel = new Label("Tuesday");
	private Label wednesdayLabel = new Label("Wednesday");
	private Label thursdayLabel = new Label("Thursday");
	private Label fridayLabel = new Label("Friday");
	private Label saturdayLabel = new Label("Saturday");
	
	public CalanderPane() {
		//this.setStyle("-fx-background-color: blue");
		this.setPrefSize(450, 600);
		this.setAlignment(Pos.TOP_CENTER);
		this.setSpacing(60);
		this.getChildren().addAll(sundayLabel,mondayLabel,tuesdayLabel,wednesdayLabel,thursdayLabel,fridayLabel,saturdayLabel);
	}	
}