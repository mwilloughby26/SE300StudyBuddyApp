import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Popup;

public class StudyGUI extends BorderPane{
	
	Pane centerPane = new Pane();
	
	public StudyGUI() {
		
		Button backBTN = new Button("BACK");
		backBTN.setStyle("-fx-background-color: #FFFFFF");
		backBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		backBTN.setTranslateX(25);
		backBTN.setTranslateY(15);
		
		backBTN.setOnAction(e -> {
			AppMenuGUI appMenu = new AppMenuGUI();
			this.setCenter(appMenu);
			
		});  
		
		
		Label StudyLBL = new Label("STUDY");
		StudyLBL.setTranslateX(340);
		StudyLBL.setTranslateY(15);
		StudyLBL.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		
		//*****************************************************
		//*****************************************************
		
		Label class1 = new Label("CS 225\nComputer Science 2");
		class1.setTranslateX(25);
		class1.setTranslateY(100);
		class1.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		Label class2 = new Label("CEC 320\nMicroprocessor Systems");
		class2.setTranslateX(25);
		class2.setTranslateY(200);
		class2.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		Label class3 = new Label("CYB 155\nFoundations Of Info. Security");
		class3.setTranslateX(25);
		class3.setTranslateY(300);
		class3.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		Label class4 = new Label("PS 160\nPhysics for Engineers 2");
		class4.setTranslateX(25);
		class4.setTranslateY(400);
		class4.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		Label class5 = new Label("MA 242\nCalc and Analytical Geom 2");
		class5.setTranslateX(25);
		class5.setTranslateY(500);
		class5.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		//*****************************************************
		//*****************************************************
		
		Button CSch2BTN = new Button("CH2");
		CSch2BTN.setStyle("-fx-background-color: #FFFFFF");
		CSch2BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CSch2BTN.setTranslateX(200);
		CSch2BTN.setTranslateY(100);
		
		Button CSch4BTN = new Button("CH4");
		CSch4BTN.setStyle("-fx-background-color: #FFFFFF");
		CSch4BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CSch4BTN.setTranslateX(300);
		CSch4BTN.setTranslateY(100);
		
		Button CSch7BTN = new Button("CH7");
		CSch7BTN.setStyle("-fx-background-color: #FFFFFF");
		CSch7BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CSch7BTN.setTranslateX(400);
		CSch7BTN.setTranslateY(100);
		
		Button CSch9BTN = new Button("CH9");
		CSch9BTN.setStyle("-fx-background-color: #FFFFFF");
		CSch9BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CSch9BTN.setTranslateX(500);
		CSch9BTN.setTranslateY(100);
		
		Button CSch12BTN = new Button("CH12");
		CSch12BTN.setStyle("-fx-background-color: #FFFFFF");
		CSch12BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CSch12BTN.setTranslateX(600);
		CSch12BTN.setTranslateY(100);
		
		//*****************************************************
		//*****************************************************
		
		Button CECch3BTN = new Button("CH3");
		CECch3BTN.setStyle("-fx-background-color: #FFFFFF");
		CECch3BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CECch3BTN.setTranslateX(250);
		CECch3BTN.setTranslateY(200);
		
		Button CECch5BTN = new Button("CH5");
		CECch5BTN.setStyle("-fx-background-color: #FFFFFF");
		CECch5BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CECch5BTN.setTranslateX(350);
		CECch5BTN.setTranslateY(200);
		
		Button CECch6BTN = new Button("CH6");
		CECch6BTN.setStyle("-fx-background-color: #FFFFFF");
		CECch6BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CECch6BTN.setTranslateX(450);
		CECch6BTN.setTranslateY(200);
		
		Button CECch8BTN = new Button("CH8");
		CECch8BTN.setStyle("-fx-background-color: #FFFFFF");
		CECch8BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CECch8BTN.setTranslateX(550);
		CECch8BTN.setTranslateY(200);
		
		
		Button CECch9BTN = new Button("CH9");
		CECch9BTN.setStyle("-fx-background-color: #FFFFFF");
		CECch9BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CECch9BTN.setTranslateX(650);
		CECch9BTN.setTranslateY(200);
		
		//*****************************************************
		//*****************************************************	
		
		Button CYBch1BTN = new Button("CH1");
		CYBch1BTN.setStyle("-fx-background-color: #FFFFFF");
		CYBch1BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CYBch1BTN.setTranslateX(290);
		CYBch1BTN.setTranslateY(300);
		
		Button CYBch2BTN = new Button("CH2");
		CYBch2BTN.setStyle("-fx-background-color: #FFFFFF");
		CYBch2BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CYBch2BTN.setTranslateX(390);
		CYBch2BTN.setTranslateY(300);
		
		Button CYBch4BTN = new Button("CH4");
		CYBch4BTN.setStyle("-fx-background-color: #FFFFFF");
		CYBch4BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CYBch4BTN.setTranslateX(490);
		CYBch4BTN.setTranslateY(300);
		
		Button CYBch8BTN = new Button("CH8");
		CYBch8BTN.setStyle("-fx-background-color: #FFFFFF");
		CYBch8BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CYBch8BTN.setTranslateX(590);
		CYBch8BTN.setTranslateY(300);
		
		CYBch8BTN.setOnAction(e -> {
			
			Pane popupPane = new Pane();
			
			Label backgroundLbl = new Label(" ");
			backgroundLbl.setMinWidth(200);
			backgroundLbl.setMinHeight(200);
			backgroundLbl.setStyle(" -fx-background-color: lightgray;");
			backgroundLbl.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(3))));
			
			Label chLbl = new Label("CH8");
			chLbl.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			chLbl.setTranslateX(75);
			chLbl.setTranslateY(20);
			
			Button exitBTN = new Button("X");
			exitBTN.setStyle("-fx-background-color: #FFFFFF");
			exitBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
			exitBTN.setTranslateX(7);
			exitBTN.setTranslateY(7);
			
			Button matchBTN = new Button("MATCH");
			matchBTN.setStyle("-fx-background-color: #FFFFFF");
			matchBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			matchBTN.setTranslateX(45);
			matchBTN.setTranslateY(75);
			
			Button typeBTN = new Button("TYPE");
			typeBTN.setStyle("-fx-background-color: #FFFFFF");
			typeBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			typeBTN.setTranslateX(55);
			typeBTN.setTranslateY(125);
			
			popupPane.getChildren().addAll(backgroundLbl,chLbl,matchBTN,typeBTN,exitBTN);
			
	        Popup popup = new Popup();
	   
	        popup.getContent().add(popupPane);
	        
	        popup.show(centerPane,600,300);
	        
	        exitBTN.setOnAction(r -> {
				
				popup.hide();
	        	
			});  
	        
	        matchBTN.setOnAction(r -> {
	        	matchGameGUI matchGUI = new matchGameGUI();
	        	popup.hide();
	        	this.setCenter(matchGUI);
				
			});  
	
	        typeBTN.setOnAction(r -> {
		
	        	popup.hide();
	        	
		
	        });  
			
		});  
		
		
		Button CYBch11BTN = new Button("CH11");
		CYBch11BTN.setStyle("-fx-background-color: #FFFFFF");
		CYBch11BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		CYBch11BTN.setTranslateX(690);
		CYBch11BTN.setTranslateY(300);
		
		//*****************************************************
		//*****************************************************
		
		Button PSch4BTN = new Button("CH4");
		PSch4BTN.setStyle("-fx-background-color: #FFFFFF");
		PSch4BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		PSch4BTN.setTranslateX(230);
		PSch4BTN.setTranslateY(400);
		
		Button PSch5BTN = new Button("CH5");
		PSch5BTN.setStyle("-fx-background-color: #FFFFFF");
		PSch5BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		PSch5BTN.setTranslateX(330);
		PSch5BTN.setTranslateY(400);
		
		Button PSch7BTN = new Button("CH7");
		PSch7BTN.setStyle("-fx-background-color: #FFFFFF");
		PSch7BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		PSch7BTN.setTranslateX(430);
		PSch7BTN.setTranslateY(400);
		
		Button PSch9BTN = new Button("CH9");
		PSch9BTN.setStyle("-fx-background-color: #FFFFFF");
		PSch9BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		PSch9BTN.setTranslateX(530);
		PSch9BTN.setTranslateY(400);
		
		Button PSch10BTN = new Button("CH10");
		PSch10BTN.setStyle("-fx-background-color: #FFFFFF");
		PSch10BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		PSch10BTN.setTranslateX(630);
		PSch10BTN.setTranslateY(400);
		
		//*****************************************************
		//*****************************************************

		
		Button MAch4BTN = new Button("CH4");
		MAch4BTN.setStyle("-fx-background-color: #FFFFFF");
		MAch4BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		MAch4BTN.setTranslateX(280);
		MAch4BTN.setTranslateY(500);
		
		Button MAch5BTN = new Button("CH5");
		MAch5BTN.setStyle("-fx-background-color: #FFFFFF");
		MAch5BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		MAch5BTN.setTranslateX(380);
		MAch5BTN.setTranslateY(500);
		
		Button MAch6BTN = new Button("CH6");
		MAch6BTN.setStyle("-fx-background-color: #FFFFFF");
		MAch6BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		MAch6BTN.setTranslateX(480);
		MAch6BTN.setTranslateY(500);
		
		Button MAch7BTN = new Button("CH7");
		MAch7BTN.setStyle("-fx-background-color: #FFFFFF");
		MAch7BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		MAch7BTN.setTranslateX(580);
		MAch7BTN.setTranslateY(500);
		
		Button MAch8BTN = new Button("CH8");
		MAch8BTN.setStyle("-fx-background-color: #FFFFFF");
		MAch8BTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		MAch8BTN.setTranslateX(680);
		MAch8BTN.setTranslateY(500); 
		
		centerPane.getChildren().addAll(backBTN,StudyLBL,
				class1,class2,class3,class4,class5,
				CSch2BTN,CSch4BTN,CSch7BTN,CSch9BTN,CSch12BTN,
				CECch3BTN,CECch5BTN,CECch6BTN,CECch8BTN,CECch9BTN,
				CYBch1BTN,CYBch2BTN,CYBch4BTN,CYBch8BTN,CYBch11BTN,
				PSch4BTN,PSch5BTN,PSch7BTN,PSch9BTN,PSch10BTN,
				MAch4BTN,MAch5BTN,MAch6BTN,MAch7BTN,MAch8BTN);
		
		this.setCenter(centerPane); 
		
		
	}
	
}