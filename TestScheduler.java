import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.geometry.Pos;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;


public class TestScheduler extends Application {
	
	private TimeSchedulerPane timeSchedulerPane = new TimeSchedulerPane();
	private Scene scene = new Scene(timeSchedulerPane);
	
	public void start(Stage primaryStage) {
		timeSchedulerPane.setPrefSize(800, 600);
		
		
		primaryStage.setTitle("StuddyBuddy");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	// Only here for environments that don't directly support the start() method
	public static void main(String[] args) {
		launch(args);
	}
}