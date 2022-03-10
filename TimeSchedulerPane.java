//*************************************************
// Class: TimeSchedulerPane
// Author: Matthew Willoughby
// Date Created: March 02, 2022
// Date Modified: March 02, 2022
//
// Purpose: 
//				
// Attributes:
//				
// Methods:
//				
//*******************************************************

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class TimeSchedulerPane extends BorderPane {
	
	private ScheduleController controller = new ScheduleController();
	
	//Internal panes
	private EventHandlerPane eventHandlerPane = new EventHandlerPane();
	private CalanderPane calanderPane = new CalanderPane();
	private VBox exitPane = new VBox();
	
	//Labels
	private Label scheduleTitle = new Label("Time Scheduler");
	
	
	public TimeSchedulerPane() {
		//Set size of TimeSchedulerPane
		this.setMaxSize(800, 600);
		
		//Title setup
		exitPane.getChildren().add(scheduleTitle);
		exitPane.setAlignment(Pos.CENTER);
		
		
		
		//Add Calendar and Event Handler to Pane
		this.setLeft(eventHandlerPane);
		this.setRight(calanderPane);
		this.setBottom(exitPane);
	}	
}
	
	