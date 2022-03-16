

public class user{
	
	private String username;
	private int points;

	public user() {
		username = "";
		points = 0;
	}
	
	
	public String getUsername() {
		return this.username;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public void setPoints(int newPoints) {
		this.points = newPoints;
	}
	
}