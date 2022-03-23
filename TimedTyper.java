import java.util.ArrayList;

public class TimedTyper
{
	ArrayList<String> termSet = new ArrayList<String>();
	public String newTerm() {
		return "test test test";
	}
	//Let user type in
	
	public int[] getIndex()
	{
		int[] indices = new int[2];
		indices[0] = termSet.size();
		//indices[1] = whereever in the set we are]
		
		return indices;
	}
}