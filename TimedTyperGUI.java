import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimedTyperGUI extends Application
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
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage primaryStage)
	{
		Scene MenuScene = new Scene(stackPane, 800, 600);
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
		redoLabel.setTranslateY(100);
		redoLabel.setVisible(false);
		indexLabel.setTranslateY(50);
		//indexLabel.setText(method call then the other stuff :));
		accuracyLabel.setText("Set accuracy: 0%");
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
		
		primaryStage.setScene(MenuScene);
		primaryStage.setTitle("Timed Typer");
		primaryStage.setResizable(false);
		primaryStage.show();
		timeline.getKeyFrames().add(keyframe);
		timeline.play();
	}
}