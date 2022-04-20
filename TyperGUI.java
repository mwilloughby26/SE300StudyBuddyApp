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

public class TyperGUI extends BorderPane
{
	private TimedTyper timedTyper = new TimedTyper();
	private StackPane stackPane = new StackPane();
	private ObservableList<Node> stackPaneChildren = stackPane.getChildren();
	private TextField userTextField = new TextField();
	private Label termLabel = new Label();
	private Label termDefLabel = new Label();
	private Label timerLabel = new Label();
	private Label finishLabel = new Label();
	private Button submitBT = new Button("Submit");
	private Button nextBT = new Button("Next");
	private Label redoLabel = new Label("Incorrect. Please fix the error and resubmit.");
	private int totalCorrect = 0;
	private int totalLength = 0;
	private Label accuracyLabel = new Label();
	private Label indexLabel = new Label();
	int index = 0;
	String term;
	String termDef;
	String[][] termSet;
	
	public TyperGUI()
	{
		termSet = timedTyper.newSet();
		setTerm();
		stackPaneChildren.addAll(termLabel, termDefLabel, userTextField, timerLabel, submitBT, nextBT, redoLabel, accuracyLabel, indexLabel, finishLabel);
		long startTime = System.nanoTime();
		StackPane.setAlignment(timerLabel, Pos.TOP_LEFT);
		StackPane.setAlignment(accuracyLabel, Pos.TOP_LEFT);
		StackPane.setAlignment(indexLabel, Pos.TOP_LEFT);
		userTextField.setPromptText("Type The Definition");
		userTextField.setFocusTraversable(false);
		accuracyLabel.setTranslateY(25);
		termLabel.setTranslateX(0);
		termLabel.setTranslateY(-175);
		termDefLabel.setTranslateX(0);
		termDefLabel.setTranslateY(-100);
		submitBT.setTranslateY(50);
		submitBT.setStyle("-fx-background-color: #FFFFFF");
		submitBT.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		redoLabel.setTranslateY(100);
		redoLabel.setVisible(false);
		indexLabel.setTranslateY(50);
		accuracyLabel.setText("Set accuracy: 0%");
		nextBT.setVisible(false);
		nextBT.setTranslateY(50);
		nextBT.setStyle("-fx-background-color: #FFFFFF");
		nextBT.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		Button exitBTN = new Button("EXIT");
		exitBTN.setStyle("-fx-background-color: #FFFFFF");
		exitBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		StackPane.setAlignment(exitBTN,Pos.TOP_RIGHT);
		exitBTN.setTranslateX(-10);
		exitBTN.setTranslateY(10);
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
			if (userTextField.getText().equalsIgnoreCase(termDef))
			{
				userTextField.setStyle("-fx-text-fill: green;");
				redoLabel.setVisible(false);
				submitBT.setVisible(false);
				nextBT.setVisible(true);
			}
			else
			{
				userTextField.setStyle("-fx-text-fill: red;");
				redoLabel.setVisible(true);
				for (int i = 0; i < termDef.length(); i++)
				{
					try
					{
						if (userTextField.getText(i, i + 1).equals(termDef.substring(i, i + 1)))
						{
							totalCorrect += 1;
						}
					} catch (Exception e)
					{
						break;
					}
				}
				totalLength += termDef.length();
			}
		});
		
		nextBT.setOnMousePressed(d -> {
				
				submitBT.setVisible(true);
				nextBT.setVisible(false);
			
				index++;
				setTerm();
				try {
				if (termDef == null)
				{
					long seconds = (long) (System.nanoTime() - startTime) / 1000000000;
					int acc = (int) (((double) totalCorrect / totalLength) * 100);
					finishLabel.setTranslateY(-50);
					finishLabel.setText("\t\t\tCongratulations!\nYou finished in " + seconds + " seconds with " + acc + "% accuracy!");
					finishLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
					finishLabel.setVisible(true);
					userTextField.setVisible(false);
					timerLabel.setVisible(false);
					termLabel.setVisible(false);
					submitBT.setVisible(false);
					accuracyLabel.setVisible(false);
				}
				
				totalCorrect += termDef.length();
				totalLength += termDef.length();
				
				}catch(Exception e) {
					
				}
			
			int accuracy = (int) (((double) totalCorrect / totalLength) * 100);
			accuracyLabel.setText("Set accuracy: " + accuracy + "%");
			});
		
		timeline.getKeyFrames().add(keyframe);
		timeline.play();
	}
	
	public void setTerm()
	{	
		userTextField.clear();
		userTextField.setStyle("-fx-text-fill: black;");
		
		term = termSet[index][0];
		termLabel.setText(term);
		termLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		termDef = termSet[index][1];
		userTextField.setText(termDef);
		termDefLabel.setText(termDef);
		termDefLabel.setMaxWidth(300);
		termDefLabel.setWrapText(true);
	}
}