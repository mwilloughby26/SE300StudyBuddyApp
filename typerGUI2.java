import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class typerGUI2 extends BorderPane
{
	private TimedTyper timedTyper = new TimedTyper();
	private StackPane stackPane = new StackPane();
	private ObservableList<Node> stackPaneChildren = stackPane.getChildren();
	private TextField userTextField = new TextField();
	private Label termLabel = new Label();
	private Label timerLabel = new Label();
	private Button submitBT = new Button("Submit");
	private Label redoLabel = new Label("Incorrect. Please fix the error and resubmit.");
	private int totalCorrect = 0;
	private int totalLength = 0;
	private Label accuracyLabel = new Label();
	private Label indexLabel = new Label();
	
	
	public typerGUI2()
	{
		String term = timedTyper.newTerm();
		termLabel.setText(term);
		stackPaneChildren.addAll(termLabel, userTextField, timerLabel, submitBT, redoLabel, accuracyLabel, indexLabel);
		long startTime = System.nanoTime();
		StackPane.setAlignment(timerLabel, Pos.TOP_LEFT);
		StackPane.setAlignment(accuracyLabel, Pos.TOP_LEFT);
		StackPane.setAlignment(indexLabel, Pos.TOP_LEFT);
		accuracyLabel.setTranslateY(25);
		termLabel.setTranslateX(0);
		termLabel.setTranslateY(-100);
		submitBT.setTranslateY(50);
		submitBT.setStyle("-fx-background-color: #FFFFFF");
		submitBT.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		redoLabel.setTranslateY(100);
		redoLabel.setVisible(false);
		indexLabel.setTranslateY(50);
		//indexLabel.setText(method call then the other stuff :));
		accuracyLabel.setText("Set accuracy: 0%");
		
		Button exitBTN = new Button("EXIT");
		exitBTN.setStyle("-fx-background-color: #FFFFFF");
		exitBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		StackPane.setAlignment(exitBTN,Pos.TOP_RIGHT);
		stackPane.getChildren().add(exitBTN);
		 
		exitBTN.setOnAction(r -> {
        	StudyGUI studyMenu = new StudyGUI();
        	this.setCenter(studyMenu);
		});  
		
		
		this.setCenter(stackPane);
		
		Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		KeyFrame keyframe = new KeyFrame(Duration.millis(1), e -> 
		{
			timerLabel.setText("Time elapsed: " + (long) (System.nanoTime() - startTime) / 1000000000 + " seconds");
		});
		
		submitBT.setOnMousePressed(d -> {
			if (userTextField.getText().equals(term))
			{
				userTextField.setStyle("-fx-text-fill: green;");
				redoLabel.setVisible(false);
			} else
			{
				userTextField.setStyle("-fx-text-fill: red;");
				redoLabel.setVisible(true);
			}
			
			for (int i = 0; i < userTextField.getText().length(); i++)
			{
				if (userTextField.getText(i, i + 1).equals(term.substring(i, i + 1)))
				{
					totalCorrect += 1;
				}
			}
			totalLength += term.length();
			int accuracy = (int) (((double) totalCorrect / totalLength) * 100);
			accuracyLabel.setText("Set accuracy: " + accuracy + "%");
			});
		
		timeline.getKeyFrames().add(keyframe);
		timeline.play();
	}
}