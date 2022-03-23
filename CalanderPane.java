import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CalanderPane extends VBox {
	
	private VBox date1Pane = new VBox();
	private VBox date2Pane = new VBox();
	private VBox date3Pane = new VBox();
	private VBox date4Pane = new VBox();
	private VBox date5Pane = new VBox();
	private VBox date6Pane = new VBox();
	private VBox date7Pane = new VBox();
	
	//date1Pane
	private Label date1Title = new Label("Placeholder");
	private HBox date1Events = new HBox();
	
	//date2Pane
	private Label date2Title = new Label("Placeholder");
	private HBox date2Events = new HBox();
	
	//date3Pane
	private Label date3Title = new Label("Placeholder");
	private HBox date3Events = new HBox();
	
	//date4Pane
	private Label date4Title = new Label("Placeholder");
	private HBox date4Events = new HBox();
	
	//date5Pane
	private Label date5Title = new Label("Placeholder");
	private HBox date5Events = new HBox();
	
	//date6Pane
	private Label date6Title = new Label("Placeholder");
	private HBox date6Events = new HBox();
	
	//date7Pane
	private Label date7Title = new Label("Placeholder");
	private HBox date7Events = new HBox();
	
	public CalanderPane() {
		//this.setStyle("-fx-background-color: blue");
		this.setPrefSize(450, 600);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(date1Pane,date2Pane,date3Pane,date4Pane,date5Pane,date6Pane,date7Pane);
		
		
		date1Events.setPrefHeight(60);
		date2Events.setPrefHeight(60);
		date3Events.setPrefHeight(60);
		date4Events.setPrefHeight(60);
		date5Events.setPrefHeight(60);
		date6Events.setPrefHeight(60);
		date7Events.setPrefHeight(60);
		
		date1Pane.setPrefHeight(80);
		date2Pane.setPrefHeight(80);
		date3Pane.setPrefHeight(80);
		date4Pane.setPrefHeight(80);
		date5Pane.setPrefHeight(80);
		date6Pane.setPrefHeight(80);
		date7Pane.setPrefHeight(80);
		
		/*
		date1Pane.setStyle("-fx-background-color: green");
		date2Pane.setStyle("-fx-background-color: green");
		date3Pane.setStyle("-fx-background-color: green");
		date4Pane.setStyle("-fx-background-color: green");
		date5Pane.setStyle("-fx-background-color: green");
		date6Pane.setStyle("-fx-background-color: green");
		date7Pane.setStyle("-fx-background-color: green");
		*/
		
		date1Pane.setAlignment(Pos.CENTER);
		date2Pane.setAlignment(Pos.CENTER);
		date3Pane.setAlignment(Pos.CENTER);
		date4Pane.setAlignment(Pos.CENTER);
		date5Pane.setAlignment(Pos.CENTER);
		date6Pane.setAlignment(Pos.CENTER);
		date7Pane.setAlignment(Pos.CENTER);
		
		
		date1Pane.getChildren().addAll(date1Title,date1Events);
		date2Pane.getChildren().addAll(date2Title,date2Events);
		date3Pane.getChildren().addAll(date3Title,date3Events);
		date4Pane.getChildren().addAll(date4Title,date4Events);
		date5Pane.getChildren().addAll(date5Title,date5Events);
		date6Pane.getChildren().addAll(date6Title,date6Events);
		date7Pane.getChildren().addAll(date7Title,date7Events);
		
		
	}	
}