import java.util.ArrayList;

public class TimedTyper
{
	studySetIO studySetIO = new studySetIO();
	String[][] termSet;
	public String[][] newSet() {
		termSet = studySetIO.getStudySet();
		return termSet;
	}
}
