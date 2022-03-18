import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;


public class studySetIO{
	String studySetArr[][] = new String[50][50];
	File ssFile = new File("IntroToInfoSecCh8.txt");
	
	public studySetIO(){
		try {
				FileReader fr = new FileReader(ssFile);
				BufferedReader br = new BufferedReader(fr);
				int i=0,j=0;
				String line;
				while ((line = br.readLine()) != null) {
					studySetArr[i][j] = line;
					j++;
				    line = br.readLine();
					studySetArr[i][j] = line;
					j--; 
					i++;
				}
				br.close();
		}catch(Exception e){
			
		}	
	}
	
	String[][] getStudySet(){
		return this.studySetArr;
	}
	
}