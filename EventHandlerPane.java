import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class EventHandlerPane extends VBox {
	private Button addEventMenuButton = new Button("Add");
	private Button modifyEventMenuButton = new Button("Modify");
	private Button deleteEventMenuButton = new Button("Delete");
	private Button addButton = new Button("Add Event");
	private Button modifyButton = new Button("Modify Event");
	private Button deleteButton = new Button("Delete Event");
	private HBox changeMenuPane = new HBox(addEventMenuButton,modifyEventMenuButton,deleteEventMenuButton);
	private Pane addEventPane = new Pane();
	private Pane modifyEventPane = new Pane();
	private Pane deleteEventPane = new Pane();
	private TextField eventNameArea = new TextField();
	private TextField eventDescriptionArea = new TextField();
	private TextField classArea = new TextField();
	private TextField timeArea = new TextField();
	private TextField modifyEventNameArea = new TextField();
	private TextField deleteEventArea = new TextField();
	private TextField modifyEventDescriptionArea = new TextField();
	private TextField modifyClassArea = new TextField();
	private TextField modifyTimeArea = new TextField();
	private Label eventNameLabel = new Label("Event Name:");
	private Label eventDescriptionLabel = new Label("Event Description:");
	private Label classLabel = new Label("Class:\n(If Applicable)");
	private Label timeLabel = new Label("Estimated Time\nto Complete:");
	private Label modifyEventNameLabel = new Label("Event Name:");
	private Label modifyEventDescriptionLabel = new Label("Event Description:");
	private Label modifyClassLabel = new Label("Class:\n(If Applicable)");
	private Label modifyTimeLabel = new Label("Estimated Time\nto Complete:");
	private Label deleteEventLabel = new Label("Event Name");
	
	public EventHandlerPane() {
		this.setPrefSize(350, 600);
		
		eventNameLabel.setLayoutX(50);
		eventNameLabel.setLayoutY(100); 
		 
		eventNameArea.setLayoutX(150);
		eventNameArea.setLayoutY(100);
		 
		eventDescriptionLabel.setLayoutX(50);
		eventDescriptionLabel.setLayoutY(200);
		
		eventDescriptionArea.setLayoutX(150);
		eventDescriptionArea.setLayoutY(200);

		classLabel.setLayoutX(50);
		classLabel.setLayoutY(300);
		
		classArea.setLayoutX(150);
		classArea.setLayoutY(300);

		timeLabel.setLayoutX(50);
		timeLabel.setLayoutY(400);
		
		timeArea.setLayoutX(150);
		timeArea.setLayoutY(400);
		
		addButton.setLayoutX(120);
		addButton.setLayoutY(500);
		
		modifyEventNameLabel.setLayoutX(50);
		modifyEventNameLabel.setLayoutY(100);
		
		modifyEventNameArea.setLayoutX(150);
		modifyEventNameArea.setLayoutY(100);
		
		modifyEventDescriptionLabel.setLayoutX(50);
		modifyEventDescriptionLabel.setLayoutY(200);
		
		modifyEventDescriptionArea.setLayoutX(150);
		modifyEventDescriptionArea.setLayoutY(200);

		modifyClassLabel.setLayoutX(50);
		modifyClassLabel.setLayoutY(300);
		
		modifyClassArea.setLayoutX(150);
		modifyClassArea.setLayoutY(300);

		modifyTimeLabel.setLayoutX(50);
		modifyTimeLabel.setLayoutY(400);
		
		modifyTimeArea.setLayoutX(150);
		modifyTimeArea.setLayoutY(400);
		
		modifyButton.setLayoutX(120);
		modifyButton.setLayoutY(500);
		
		deleteEventLabel.setLayoutX(50);
		deleteEventLabel.setLayoutY(200);
		
		deleteEventArea.setLayoutX(150);
		deleteEventArea.setLayoutY(200);
		
		deleteButton.setLayoutX(120);
		deleteButton.setLayoutY(500);
		 
		addEventPane.getChildren().addAll(eventNameLabel,eventNameArea,eventDescriptionLabel,eventDescriptionArea,classLabel,classArea,timeLabel,timeArea,addButton);
		modifyEventPane.getChildren().addAll(modifyEventNameLabel,modifyEventNameArea,modifyEventDescriptionLabel,modifyEventDescriptionArea,modifyClassLabel,modifyClassArea,modifyTimeLabel,modifyTimeArea,modifyButton);
		deleteEventPane.getChildren().addAll(deleteEventLabel,deleteEventArea,deleteButton);
		changeMenuPane.setAlignment(Pos.CENTER);
		changeMenuPane.setSpacing(30);
		this.getChildren().addAll(changeMenuPane,addEventPane);
		
		
		addEventMenuButton.setDisable(true);
		
		addEventMenuButton.setOnAction(e -> openAddEventMenu());
		modifyEventMenuButton.setOnAction(e -> openModifyEventMenu());
		deleteEventMenuButton.setOnAction(e -> openDeleteEventMenu());
		

		
		//addEventPane.setStyle("-fx-background-color: green");
		//modifyEventPane.setStyle("-fx-background-color: yellow");
		//deleteEventPane.setStyle("-fx-background-color: red");
	}

	private void openDeleteEventMenu() {
		deleteEventMenuButton.setDisable(true);
		addEventMenuButton.setDisable(false);
		modifyEventMenuButton.setDisable(false);
		this.getChildren().removeAll(modifyEventPane,addEventPane);
		this.getChildren().add(deleteEventPane);
	}

	private void openModifyEventMenu() {
		deleteEventMenuButton.setDisable(false);
		addEventMenuButton.setDisable(false);
		modifyEventMenuButton.setDisable(true);
		this.getChildren().removeAll(deleteEventPane,addEventPane);
		this.getChildren().add(modifyEventPane);
	}

	private void openAddEventMenu() {
		deleteEventMenuButton.setDisable(false);
		addEventMenuButton.setDisable(true);
		modifyEventMenuButton.setDisable(false);
		this.getChildren().removeAll(deleteEventPane,modifyEventPane);
		this.getChildren().add(addEventPane);
		}	
}