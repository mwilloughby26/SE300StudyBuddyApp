import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class matchGameGUI extends BorderPane{
	
	Pane centerPane = new Pane();
	studySetIO ssIO = new studySetIO();
	String[][] ssArr = ssIO.getStudySet();
	
	public matchGameGUI() {
		
		Button backBTN = new Button("BACK");
		backBTN.setStyle("-fx-background-color: #FFFFFF");
		backBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		backBTN.setTranslateX(25);
		backBTN.setTranslateY(15);
		
		backBTN.setOnAction(e -> {
			StudyGUI StudyMenu = new StudyGUI();
			this.setCenter(StudyMenu);
			
		});  
		
		////////////////////////////////////////////////////////////////////////////
		
		Label def1 = new Label("1) " + ssArr[0][1]);
		def1.setTranslateX(50);
		def1.setTranslateY(75);
		def1.setMaxWidth(250);
		def1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		def1.setWrapText(true);
		
		Label def2 = new Label("2) " + ssArr[1][1]);
		def2.setTranslateX(50);
		def2.setTranslateY(175);
		def2.setMaxWidth(250);
		def2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		def2.setWrapText(true);
		
		Label def3 = new Label("3) " + ssArr[2][1]);
		def3.setTranslateX(50);
		def3.setTranslateY(315);
		def3.setMaxWidth(250);
		def3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		def3.setWrapText(true);
		
		Label def4 = new Label("4) " + ssArr[3][1]);
		def4.setTranslateX(50);
		def4.setTranslateY(400);
		def4.setMaxWidth(250);
		def4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		def4.setWrapText(true);
		
		Label def5 = new Label("5) " + ssArr[4][1]);
		def5.setTranslateX(50);
		def5.setTranslateY(500);
		def5.setMaxWidth(250);
		def5.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		def5.setWrapText(true);
		
		////////////////////////////////////////////////////////////////////////////
		
		Label wordBank = new Label("WORD BANK");
		wordBank.setTranslateX(500);
		wordBank.setTranslateY(25);
		wordBank.setMaxWidth(250);
		wordBank.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		////////////////////////////////////////////////////////////////////////////
		
		Label word1 = new Label(ssArr[0][0]);
		word1.setTranslateX(400);
		word1.setTranslateY(45);
		word1.setMaxWidth(250);
		word1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		word1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(2))));
		
		Label word2 = new Label(ssArr[1][0]);
		word2.setTranslateX(600);
		word2.setTranslateY(45);
		word2.setMaxWidth(300);
		word2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		word2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(2))));
		
		Label word3 = new Label(ssArr[2][0]);
		word3.setTranslateX(350);
		word3.setTranslateY(65);
		word3.setMaxWidth(250);
		word3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		word3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(2))));
		
		Label word4 = new Label(ssArr[3][0]);
		word4.setTranslateX(525);
		word4.setTranslateY(65);
		word4.setMaxWidth(250);
		word4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		word4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(2))));
		
		Label word5 = new Label(ssArr[4][0]);
		word5.setTranslateX(450);
		word5.setTranslateY(85);
		word5.setMaxWidth(250);
		word5.setWrapText(true);
		word5.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		word5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
					CornerRadii.EMPTY, new BorderWidths(2))));
		
		////////////////////////////////////////////////////////////////////////////
		
		TextField ans1 = new TextField();
		ans1.setTranslateX(500);
		ans1.setTranslateY(130);
		ans1.setPromptText("1) ");
		
		TextField ans2 = new TextField();
		ans2.setTranslateX(500);
		ans2.setTranslateY(210);
		ans2.setPromptText("2) ");
		
		TextField ans3 = new TextField();
		ans3.setTranslateX(500);
		ans3.setTranslateY(290);
		ans3.setPromptText("3) ");
		
		TextField ans4 = new TextField();
		ans4.setTranslateX(500);
		ans4.setTranslateY(370);
		ans4.setPromptText("4) ");
		
		TextField ans5 = new TextField();
		ans5.setTranslateX(500);
		ans5.setTranslateY(450);
		ans5.setPromptText("5) ");
		
		////////////////////////////////////////////////////////////////////////////
		
		Button submitBTN = new Button("SUBMIT");
		submitBTN.setTranslateX(525);
		submitBTN.setTranslateY(500);
		submitBTN.setStyle("-fx-background-color: #FFFFFF");
		submitBTN.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		submitBTN.setOnAction(e -> {
			
			if(ans1.getText().equalsIgnoreCase(ssArr[0][0])){
				
				Image image = new Image("img/checkmark.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(130);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
			}else {
				
				Image image = new Image("img/redx.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(130);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
				Label rightAns = new Label(ssArr[0][0]);
				rightAns.setTranslateX(500);
				rightAns.setTranslateY(160);
				rightAns.setMaxWidth(250);
				rightAns.setTextFill(Color.GREEN);
				rightAns.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
				centerPane.getChildren().add(rightAns);
				
			}
			
			if(ans2.getText().equalsIgnoreCase(ssArr[1][0])){
				Image image = new Image("img/checkmark.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(210);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
			}else {
				Image image = new Image("img/redx.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(210);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
				Label rightAns = new Label(ssArr[1][0]);
				rightAns.setTranslateX(500);
				rightAns.setTranslateY(240);
				rightAns.setMaxWidth(250);
				rightAns.setTextFill(Color.GREEN);
				rightAns.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
				centerPane.getChildren().add(rightAns);
			}

			if(ans3.getText().equalsIgnoreCase(ssArr[2][0])) {
				Image image = new Image("img/checkmark.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(290);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
			}else {
				Image image = new Image("img/redx.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(290);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
				Label rightAns = new Label(ssArr[2][0]);
				rightAns.setTranslateX(500);
				rightAns.setTranslateY(320);
				rightAns.setMaxWidth(250);
				rightAns.setTextFill(Color.GREEN);
				rightAns.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
				centerPane.getChildren().add(rightAns);
			}

			if(ans4.getText().equalsIgnoreCase(ssArr[3][0])) {
				Image image = new Image("img/checkmark.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(370);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
			}else {
				Image image = new Image("img/redx.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(370);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
				Label rightAns = new Label(ssArr[3][0]);
				rightAns.setTranslateX(500);
				rightAns.setTranslateY(400);
				rightAns.setMaxWidth(250);
				rightAns.setTextFill(Color.GREEN);
				rightAns.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
				centerPane.getChildren().add(rightAns);
			}
			
			if(ans5.getText().equalsIgnoreCase(ssArr[4][0])) {
				Image image = new Image("img/checkmark.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(450);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
			}else {
				Image image = new Image("img/redx.png");
				ImageView imageView = new ImageView(image);
				imageView.setX(480);
				imageView.setY(450);
				imageView.setFitHeight(25);
			    imageView.setFitWidth(25);
				centerPane.getChildren().add(imageView);
				
				Label rightAns = new Label(ssArr[4][0]);
				rightAns.setTranslateX(500);
				rightAns.setTranslateY(480);
				rightAns.setMaxWidth(250);
				rightAns.setTextFill(Color.GREEN);
				rightAns.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
				centerPane.getChildren().add(rightAns);
			}
			
			submitBTN.setVisible(false);
			
			ans1.setEditable(false);
			ans2.setEditable(false);
			ans3.setEditable(false);
			ans4.setEditable(false);
			ans5.setEditable(false);
			
		});  
		
		centerPane.getChildren().addAll(backBTN,def1,def2,def3,def4,def5,wordBank,
				word1,word2,word3,word4,word5,ans1,ans2,ans3,ans4,ans5,
				submitBTN);
		
		this.setCenter(centerPane); 
				
	}
	
}