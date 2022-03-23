import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class TestScheduler extends Application {
	
	private SchedulerPane schedulerPane = new SchedulerPane();
	private Scene scene = new Scene(schedulerPane);
	
	public void start(Stage primaryStage) {
		schedulerPane.setPrefSize(800, 600);
		
		
		primaryStage.setTitle("StuddyBuddy");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	// Only here for environments that don't directly support the start() method
	public static void main(String[] args) {
		launch(args);
	}
}