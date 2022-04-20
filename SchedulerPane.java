//*************************************************
// Class: TimeSchedulerPane
// Author: Matthew Willoughby
// Date Created: March 02, 2022
// Date Modified: April 19, 2022
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Popup;
import java.io.FileWriter;
import java.io.IOException;

public class SchedulerPane extends Pane {
	private LocalDate currentDate = LocalDate.now();
	
	//buttons
	private Button backButton = new Button("Main Menu");
	private Button addButton = new Button("Add Event");
	private Button modifyButton = new Button("Modify Event");
	private Button deleteButton = new Button("Delete Event");
	
	//date1Pane
	private Label date1Label = new Label("Placeholder");
	private VBox date1Events = new VBox();
	
	//date2Pane
	private Label date2Label = new Label("Placeholder");
	private VBox date2Events = new VBox();
	
	//date3Pane
	private Label date3Label = new Label("Placeholder");
	private VBox date3Events = new VBox();
	
	//date4Pane
	private Label date4Label = new Label("Placeholder");
	private VBox date4Events = new VBox();
	
	//date5Pane
	private Label date5Label = new Label("Placeholder");
	private VBox date5Events = new VBox();
	
	//date6Pane
	private Label date6Label = new Label("Placeholder");
	private VBox date6Events = new VBox();
	
	//date7Pane
	private Label date7Label = new Label("Placeholder");
	private VBox date7Events = new VBox();
	
	//menus
	private Popup addMenu = new Popup();
	private Popup modifyMenu = new Popup();
	private Popup deleteMenu = new Popup();
	
	//math model
	private ArrayList<CalanderEvent> eventList = new ArrayList<CalanderEvent>();
	ComboBox<String> modifyEventListDropDown = new ComboBox<String>();
	ComboBox<String> deleteEventListDropDown = new ComboBox<String>();
	
	public SchedulerPane(Button backButton) {
		//import data from csv
		File eventDataFile = new File("EventData.csv");
		importData(eventDataFile);
		
		
		//Set size of TimeSchedulerPane
		this.setMaxSize(800, 600);
		this.setStyle("-fx-background-color: lightblue");
		
		backButton.setLayoutX(50);
		backButton.setLayoutY(575);
		addButton.setLayoutX(250);
		addButton.setLayoutY(575);
		modifyButton.setLayoutX(425);
		modifyButton.setLayoutY(575);
		deleteButton.setLayoutX(600);
		deleteButton.setLayoutY(575);
		
		addButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		modifyButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		deleteButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		backButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		
		addButton.setPrefWidth(150);
		modifyButton.setPrefWidth(150);
		deleteButton.setPrefWidth(150);
		backButton.setPrefWidth(150);
		
		date1Label.setPrefWidth(800/7);
		date1Label.setLayoutX(0);
		date1Label.setLayoutY(10);
		date2Label.setPrefWidth(800/7);
		date2Label.setLayoutX(800/7);
		date2Label.setLayoutY(10);
		date3Label.setPrefWidth(800/7);
		date3Label.setLayoutX(800/7*2);
		date3Label.setLayoutY(10);
		date4Label.setPrefWidth(800/7);
		date4Label.setLayoutX(800/7*3);
		date4Label.setLayoutY(10);
		date5Label.setPrefWidth(800/7);
		date5Label.setLayoutX(800/7*4);
		date5Label.setLayoutY(10);
		date6Label.setPrefWidth(800/7);
		date6Label.setLayoutX(800/7*5);
		date6Label.setLayoutY(10);
		date7Label.setPrefWidth(800/7);
		date7Label.setLayoutX(800/7*6);
		date7Label.setLayoutY(10);
		
		date1Events.setPrefWidth(800/7);
		date1Events.setLayoutX(0);
		date1Events.setLayoutY(30);
		date2Events.setPrefWidth(800/7);
		date2Events.setLayoutX(800/7);
		date2Events.setLayoutY(30);
		date3Events.setPrefWidth(800/7);
		date3Events.setLayoutX(800/7*2);
		date3Events.setLayoutY(30);
		date4Events.setPrefWidth(800/7);
		date4Events.setLayoutX(800/7*3);
		date4Events.setLayoutY(30);
		date5Events.setPrefWidth(800/7);
		date5Events.setLayoutX(800/7*4);
		date5Events.setLayoutY(30);
		date6Events.setPrefWidth(800/7);
		date6Events.setLayoutX(800/7*5);
		date6Events.setLayoutY(30);
		date7Events.setPrefWidth(800/7);
		date7Events.setLayoutX(800/7*6);
		date7Events.setLayoutY(30);

		date1Label.setAlignment(Pos.CENTER);
		date2Label.setAlignment(Pos.CENTER);
		date3Label.setAlignment(Pos.CENTER);
		date4Label.setAlignment(Pos.CENTER);
		date5Label.setAlignment(Pos.CENTER);
		date6Label.setAlignment(Pos.CENTER);
		date7Label.setAlignment(Pos.CENTER);
		
		date1Events.setAlignment(Pos.CENTER);
		date2Events.setAlignment(Pos.CENTER);
		date3Events.setAlignment(Pos.CENTER);
		date4Events.setAlignment(Pos.CENTER);
		date5Events.setAlignment(Pos.CENTER);
		date6Events.setAlignment(Pos.CENTER);
		date7Events.setAlignment(Pos.CENTER);

		this.getChildren().addAll(backButton,addButton,modifyButton,deleteButton,date1Label,date2Label,date3Label,date4Label,date5Label,date6Label,date7Label);
		this.getChildren().addAll(date1Events,date2Events,date3Events,date4Events,date5Events,date6Events,date7Events);
		
		
		
		//dates
		date1Label.setText(currentDate.toString());
		date2Label.setText(currentDate.plusDays(1).toString());
		date3Label.setText(currentDate.plusDays(2).toString());
		date4Label.setText(currentDate.plusDays(3).toString());
		date5Label.setText(currentDate.plusDays(4).toString());
		date6Label.setText(currentDate.plusDays(5).toString());
		date7Label.setText(currentDate.plusDays(6).toString());
		
		//cosmetics
		Line line1 = new Line(800/7,0,800/7,570);
		Line line2 = new Line(800/7*2,0,800/7*2,570);
		Line line3 = new Line(800/7*3,0,800/7*3,570);
		Line line4 = new Line(800/7*4,0,800/7*4,570);
		Line line5 = new Line(800/7*5,0,800/7*5,570);
		Line line6 = new Line(800/7*6,0,800/7*6,570);
		Line line7 = new Line(0,30,800,30);
		this.getChildren().addAll(line1,line2,line3,line4,line5,line6,line7);
		
		
		//button functionality
		addButton.setOnAction(e -> addMenu.show(this,600,300));
		modifyButton.setOnAction(e -> modifyMenu.show(this,600,300));
		deleteButton.setOnAction(e -> deleteMenu.show(this,600,300));
		backButton.setOnAction(e -> saveAndExit());
		
		//modify menu
		Pane modifyMenuPane = new Pane();
		modifyMenuPane.setPrefSize(300, 300);
		
		Label modifyMenuBackground = new Label("");
		modifyMenuBackground.setStyle("-fx-background-color: lightgray");
		modifyMenuBackground.setPrefSize(300, 300);
		modifyMenuBackground.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, new BorderWidths(2))));
		modifyMenuPane.getChildren().add(modifyMenuBackground);
		
		Button modifyMenuExitButton = new Button("x");
		modifyMenuExitButton.setOnAction(e -> modifyMenu.hide());
		modifyMenuExitButton.setLayoutX(0);
		modifyMenuExitButton.setLayoutY(0);
		modifyMenuPane.getChildren().add(modifyMenuExitButton);
		
		
		Label modifyEventListDropDownLabel = new Label("Event List");
		modifyEventListDropDownLabel.setLayoutX(10);
		modifyEventListDropDownLabel.setLayoutY(30);
		modifyMenuPane.getChildren().add(modifyEventListDropDownLabel);
		
		
		this.modifyEventListDropDown.setLayoutX(100);
		this.modifyEventListDropDown.setLayoutY(30);
		this.modifyEventListDropDown.setPrefWidth(150);
		modifyMenuPane.getChildren().add(this.modifyEventListDropDown);
		
		Label modifyMenuNameLabel = new Label("Event Name:");
		modifyMenuNameLabel.setLayoutX(10);
		modifyMenuNameLabel.setLayoutY(60);
		modifyMenuPane.getChildren().add(modifyMenuNameLabel);
		
		TextField modifyMenuNameInput = new TextField();
		modifyMenuNameInput.setLayoutX(100);
		modifyMenuNameInput.setLayoutY(60);
		modifyMenuPane.getChildren().add(modifyMenuNameInput);
		
		Label modifyMenuDescriptionLabel = new Label("Description:");
		modifyMenuDescriptionLabel.setLayoutX(10);
		modifyMenuDescriptionLabel.setLayoutY(90);
		modifyMenuPane.getChildren().add(modifyMenuDescriptionLabel);
		
		TextField modifyMenuDescriptionInput = new TextField();
		modifyMenuDescriptionInput.setLayoutX(100);
		modifyMenuDescriptionInput.setLayoutY(90);
		modifyMenuPane.getChildren().add(modifyMenuDescriptionInput);
		
		Label modifyMenuMonthLabel = new Label("Month:");
		modifyMenuMonthLabel.setLayoutX(10);
		modifyMenuMonthLabel.setLayoutY(120);
		modifyMenuPane.getChildren().add(modifyMenuMonthLabel);
		
		TextField modifyMenuMonthInput = new TextField();
		modifyMenuMonthInput.setLayoutX(100);
		modifyMenuMonthInput.setLayoutY(120);
		modifyMenuPane.getChildren().add(modifyMenuMonthInput);
		
		Label modifyMenuDayLabel = new Label("Day:");
		modifyMenuDayLabel.setLayoutX(10);
		modifyMenuDayLabel.setLayoutY(150);
		modifyMenuPane.getChildren().add(modifyMenuDayLabel);
		
		TextField modifyMenuDayInput = new TextField();
		modifyMenuDayInput.setLayoutX(100);
		modifyMenuDayInput.setLayoutY(150);
		modifyMenuPane.getChildren().add(modifyMenuDayInput);
		
		Label modifyMenuYearLabel = new Label("Year:");
		modifyMenuYearLabel.setLayoutX(10);
		modifyMenuYearLabel.setLayoutY(180);
		modifyMenuPane.getChildren().add(modifyMenuYearLabel);
		
		TextField modifyMenuYearInput = new TextField();
		modifyMenuYearInput.setLayoutX(100);
		modifyMenuYearInput.setLayoutY(180);
		modifyMenuPane.getChildren().add(modifyMenuYearInput);
		
		Label modifyMenuClassLabel = new Label("Associated Class:\n(If Applicable)");
		modifyMenuClassLabel.setLayoutX(10);
		modifyMenuClassLabel.setLayoutY(210);
		modifyMenuPane.getChildren().add(modifyMenuClassLabel);
		
		TextField modifyMenuClassInput = new TextField();
		modifyMenuClassInput.setLayoutX(100);
		modifyMenuClassInput.setLayoutY(210);
		modifyMenuPane.getChildren().add(modifyMenuClassInput);
		
		Button modifyMenuAddButton = new Button("Modify");
		modifyMenuAddButton.setLayoutX(110);
		modifyMenuAddButton.setLayoutY(270);
		modifyMenuPane.getChildren().add(modifyMenuAddButton);
		modifyMenuPane.setStyle("-fx-background-color: lightgray");
		modifyMenuAddButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		//modifyMenuAddButton.setOnAction(e -> modifyEvent(modifyMenuNameInput.getText(),modifyMenuDescriptionInput.getText(),
		//		modifyMenuMonthInput.getText(),modifyMenuDayInput.getText(),modifyMenuYearInput.getText(),modifyMenuClassInput.getText()));
		
		modifyMenu.getContent().add(modifyMenuPane);
		modifyEventListDropDown.setOnAction(e -> selectEvent(modifyEventListDropDown,modifyMenuNameInput,modifyMenuDescriptionInput,
				modifyMenuMonthInput,modifyMenuDayInput,modifyMenuYearInput, modifyMenuClassInput));
		
		modifyMenuAddButton.setOnAction(e -> modifyEvent(modifyMenuNameInput.getText(),modifyMenuDescriptionInput.getText(),
				modifyMenuMonthInput.getText(),modifyMenuDayInput.getText(),modifyMenuYearInput.getText(),modifyMenuClassInput.getText()));
		
		
		//add menu
		Pane addMenuPane = new Pane();
		addMenuPane.setPrefSize(300, 300);
		
		Label addMenuBackground = new Label("");
		addMenuBackground.setStyle("-fx-background-color: lightgray");
		addMenuBackground.setPrefSize(300, 300);
		addMenuBackground.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, new BorderWidths(2))));
		addMenuPane.getChildren().add(addMenuBackground);
		
		Button addMenuExitButton = new Button("x");
		addMenuExitButton.setOnAction(e -> addMenu.hide());
		addMenuExitButton.setLayoutX(0);
		addMenuExitButton.setLayoutY(0);
		addMenuPane.getChildren().add(addMenuExitButton);
		
		
		Label addMenuNameLabel = new Label("Event Name:");
		addMenuNameLabel.setLayoutX(10);
		addMenuNameLabel.setLayoutY(30);
		addMenuPane.getChildren().add(addMenuNameLabel);
		
		TextField addMenuNameInput = new TextField();
		addMenuNameInput.setLayoutX(100);
		addMenuNameInput.setLayoutY(30);
		addMenuPane.getChildren().add(addMenuNameInput);
		
		Label addMenuDescriptionLabel = new Label("Description:");
		addMenuDescriptionLabel.setLayoutX(10);
		addMenuDescriptionLabel.setLayoutY(60);
		addMenuPane.getChildren().add(addMenuDescriptionLabel);
		
		TextField addMenuDescriptionInput = new TextField();
		addMenuDescriptionInput.setLayoutX(100);
		addMenuDescriptionInput.setLayoutY(60);
		addMenuPane.getChildren().add(addMenuDescriptionInput);
		
		Label addMenuMonthLabel = new Label("Month:");
		addMenuMonthLabel.setLayoutX(10);
		addMenuMonthLabel.setLayoutY(90);
		addMenuPane.getChildren().add(addMenuMonthLabel);
		
		TextField addMenuMonthInput = new TextField();
		addMenuMonthInput.setLayoutX(100);
		addMenuMonthInput.setLayoutY(90);
		addMenuPane.getChildren().add(addMenuMonthInput);
		
		Label addMenuDayLabel = new Label("Day:");
		addMenuDayLabel.setLayoutX(10);
		addMenuDayLabel.setLayoutY(120);
		addMenuPane.getChildren().add(addMenuDayLabel);
		
		TextField addMenuDayInput = new TextField();
		addMenuDayInput.setLayoutX(100);
		addMenuDayInput.setLayoutY(120);
		addMenuPane.getChildren().add(addMenuDayInput);
		
		Label addMenuYearLabel = new Label("Year:");
		addMenuYearLabel.setLayoutX(10);
		addMenuYearLabel.setLayoutY(150);
		addMenuPane.getChildren().add(addMenuYearLabel);
		
		TextField addMenuYearInput = new TextField();
		addMenuYearInput.setLayoutX(100);
		addMenuYearInput.setLayoutY(150);
		addMenuPane.getChildren().add(addMenuYearInput);
		
		Label addMenuClassLabel = new Label("Associated Class:\n(If Applicable)");
		addMenuClassLabel.setLayoutX(10);
		addMenuClassLabel.setLayoutY(180);
		addMenuPane.getChildren().add(addMenuClassLabel);
		
		TextField addMenuClassInput = new TextField();
		addMenuClassInput.setLayoutX(100);
		addMenuClassInput.setLayoutY(180);
		addMenuPane.getChildren().add(addMenuClassInput);
		
		Button addMenuAddButton = new Button("Add");
		addMenuAddButton.setLayoutX(130);
		addMenuAddButton.setLayoutY(250);
		addMenuPane.getChildren().add(addMenuAddButton);
		addMenuPane.setStyle("-fx-background-color: lightgray");
		addMenuAddButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		addMenuAddButton.setOnAction(e -> addEvent(addMenuNameInput.getText(),addMenuDescriptionInput.getText(),
				addMenuMonthInput.getText(),addMenuDayInput.getText(),addMenuYearInput.getText(),addMenuClassInput.getText()));
		
		addMenu.getContent().add(addMenuPane);
		
		
		
		//delete menu
		Pane deleteMenuPane = new Pane();
		deleteMenuPane.setPrefSize(300, 100);
		deleteMenu.getContent().add(deleteMenuPane);
		
		Label deleteMenuBackground = new Label("");
		deleteMenuBackground.setStyle("-fx-background-color: lightgray");
		deleteMenuBackground.setPrefSize(300, 100);
		deleteMenuBackground.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
		CornerRadii.EMPTY, new BorderWidths(2))));
		deleteMenuPane.getChildren().add(deleteMenuBackground);
		
		Button deleteMenuExitButton = new Button("x");
		deleteMenuExitButton.setOnAction(e -> deleteMenu.hide());
		deleteMenuExitButton.setLayoutX(0);
		deleteMenuExitButton.setLayoutY(0);
		deleteMenuPane.getChildren().add(deleteMenuExitButton);
		
		Label deleteMenuNameLabel = new Label("Event Name:");
		deleteMenuNameLabel.setLayoutX(10);
		deleteMenuNameLabel.setLayoutY(30);
		deleteMenuPane.getChildren().add(deleteMenuNameLabel);
		
		Button deleteButton = new Button("Delete");
		deleteButton.setLayoutX(130);
		deleteButton.setLayoutY(65);
		deleteButton.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		deleteMenuPane.getChildren().add(deleteButton);
		deleteButton.setOnAction(e -> deleteEvent());
		
		this.deleteEventListDropDown.setLayoutX(100);
		this.deleteEventListDropDown.setLayoutY(30);
		this.deleteEventListDropDown.setPrefWidth(150);
		deleteMenuPane.getChildren().add(this.deleteEventListDropDown);
		deleteEventListDropDown.setOnAction(e -> selectEvent(deleteEventListDropDown,modifyMenuNameInput,modifyMenuDescriptionInput,
				modifyMenuMonthInput,modifyMenuDayInput,modifyMenuYearInput, modifyMenuClassInput));
	}	

	

	private void deleteEvent() {
		for (int i = 0; i < eventList.size(); i++) {
			if (this.eventList.get(i).getName() == this.deleteEventListDropDown.getValue()) {
				eventList.remove(i);
				updateCalander();
				updateComboBox();
			}
		}
	}

	private void selectEvent(ComboBox<String> comboBox, TextField modifyMenuNameInput,TextField modifyMenuDescriptionInput,
			TextField modifyMenuMonthInput,TextField modifyMenuDayInput,TextField modifyMenuYearInput, TextField modifyMenuClassInput) {
		for (int i = 0; i < eventList.size(); i++) {
			if (this.eventList.get(i).getName() == comboBox.getValue()) {
				modifyMenuNameInput.setText(eventList.get(i).getName());
				modifyMenuDescriptionInput.setText(eventList.get(i).getDescription());
				modifyMenuMonthInput.setText(Integer.toString(eventList.get(i).getDate().getMonthValue()));
				for (int k = 0; k < 10; k++)
				if (modifyMenuMonthInput.getText().equals(Integer.toString(k))) {
					modifyMenuMonthInput.setText("0"+k);
				}
				modifyMenuDayInput.setText(Integer.toString(eventList.get(i).getDate().getDayOfMonth()));
				modifyMenuYearInput.setText(Integer.toString(eventList.get(i).getDate().getYear()));
				modifyMenuClassInput.setText(eventList.get(i).getAssociatedClass());
			}
		}
	}
	
	public void modifyEvent(String eventName, String eventDescription, String eventMonth, String eventDay, String eventYear, String eventClass) {
		for (int i = 0; i < eventList.size(); i++) {
			if (this.eventList.get(i).getName() == this.modifyEventListDropDown.getValue()) {
				this.eventList.get(i).setName(eventName);
				this.eventList.get(i).setDescription(eventDescription);
				this.eventList.get(i).setDate(eventMonth, eventDay, eventYear);;
				updateCalander();
				updateComboBox();
			}
		}
	}

	public void addEvent(String eventName, String eventDescription, String eventMonth, String eventDay, String eventYear, String eventClass) {
		CalanderEvent newEvent = new CalanderEvent();
		newEvent.setName(eventName);
		newEvent.setDescription(eventDescription);
		newEvent.setDate(eventMonth, eventDay, eventYear);
		newEvent.setAssociatedClass(eventClass);
		eventList.add(newEvent);
		updateCalander();
		updateComboBox();
	}
	
	private void updateComboBox() {
		this.modifyEventListDropDown.getItems().clear();
		this.deleteEventListDropDown.getItems().clear();
		for (int i = 0; i < this.eventList.size(); i++) {
			this.modifyEventListDropDown.getItems().add(this.eventList.get(i).getName());
			this.deleteEventListDropDown.getItems().add(this.eventList.get(i).getName());
		}
	}
	
	public void updateCalander() {
		date1Events.getChildren().clear();
		date2Events.getChildren().clear();
		date3Events.getChildren().clear();
		date4Events.getChildren().clear();
		date5Events.getChildren().clear();
		date6Events.getChildren().clear();
		date7Events.getChildren().clear();
		
		for (int i = 0; i < eventList.size(); i++) {
			if(eventList.get(i).getDate().isEqual(currentDate)) {
				displayEvent(eventList.get(i),date1Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(1))) {
				displayEvent(eventList.get(i),date2Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(2))) {
				displayEvent(eventList.get(i),date3Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(3))) {
				displayEvent(eventList.get(i),date4Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(4))) {
				displayEvent(eventList.get(i),date5Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(5))) {
				displayEvent(eventList.get(i),date6Events);
			} else if(eventList.get(i).getDate().isEqual(currentDate.plusDays(6))) {
				displayEvent(eventList.get(i),date7Events);
			}		
		}		
		
	}

	private void displayEvent(CalanderEvent newEvent, VBox dateEvents) {
		Label eventName = new Label(newEvent.getName().toString());
		dateEvents.getChildren().add(eventName);
		Popup detailPopup = new Popup();
		StackPane detailPane = new StackPane();
		detailPane.setPrefSize(300, 300);
		Button detailPopupExitButton = new Button("x");
		detailPopupExitButton.setOnAction(e -> detailPopup.hide());
		StackPane.setAlignment(detailPopupExitButton,Pos.TOP_LEFT);
		Label background = new Label("");
		background.setPrefSize(300, 300);
		background.setLayoutX(-150);
		background.setLayoutY(-150);
		background.setStyle("-fx-background-color: lightgrey");
		background.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, new BorderWidths(2))));
		Label description = new Label(newEvent.getAssociatedClass() + " - " + newEvent.getDescription());
		description.setAlignment(Pos.CENTER);
		description.setWrapText(true);
		description.setMaxWidth(200);
		detailPane.getChildren().addAll(background, description,detailPopupExitButton);
		detailPopup.getContent().add(detailPane);
		
		eventName.setOnMousePressed(e -> detailPopup.show(this, 600, 300));
	}
	private void importData(File eventDataFile) {
		try {
			FileReader fr = new FileReader(eventDataFile);
			BufferedReader br = new BufferedReader(fr);
			// make a String called line
			String line;

			// read the header line in the file
			line = br.readLine();
			
			// while line is equal to the next line of the bufferedreader is not equal to null
			// this means read the next line in the file until there are not more line to read
			while ((line = br.readLine()) != null) {

				// make an array to hold the columns 
				String[] lineColumns;
				// break the line up to columns. break on the comma and delete the comma
				lineColumns = line.split(",");
				
				if (lineColumns[0].equals("Name") == false) {
					CalanderEvent newEvent = new CalanderEvent();
					newEvent.setName(lineColumns[0]);
					newEvent.setDescription(lineColumns[1]);
					String[] date = lineColumns[2].split("-");
					newEvent.setDate(date[1], date[2], date[0]);
					newEvent.setAssociatedClass(lineColumns[3]);
					eventList.add(newEvent);
					updateCalander();
					updateComboBox();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		CanvasIntegration canvas = new CanvasIntegration();
		ArrayList<String> courses = canvas.getCourseIDs();
		ArrayList<String> assignments = canvas.getAssignments(courses);
		for (int i = 0; i < assignments.size()/2; i++) {
			if (!(assignments.get(i*2+1).equals("null"))) {
				System.out.println("Date:"+assignments.get(i*2+1));
				CalanderEvent newEvent = new CalanderEvent();
				newEvent.setName(assignments.get(i*2));
				String[] assignmentDate = assignments.get(i*2+1).split("-");
				System.out.println(assignmentDate.length);
				//above line returns YYYY-MM-DD
				newEvent.setDate(assignmentDate[1],assignmentDate[2], assignmentDate[0]);
				this.eventList.add(newEvent);
				updateCalander();
				updateComboBox();
			}
		}
		
	}
	private void saveAndExit() {
		try {
			FileWriter fileWriter = new FileWriter("EventData.csv");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Name,Description,Date,Class");
			bufferedWriter.newLine();
			for (int i = 0; i < eventList.size(); i++) {
				bufferedWriter.write(this.eventList.get(i).getName()+","+this.eventList.get(i).getDescription()+","+this.eventList.get(i).getDate()+","+this.eventList.get(i).getAssociatedClass());
				bufferedWriter.newLine();	
			}
			bufferedWriter.close();
		} catch (Exception e) {
			
		}
		
	}
}
	
	