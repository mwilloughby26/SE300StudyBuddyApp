public class CalanderEvent {
	
	private String title;
	private String description;
	private Integer day;
	private Integer month;
	private Integer year;
	private String associatedClass;
	private boolean isComplete;
	
	
	public CalanderEvent() {
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getDay() {
		return day;
	}


	public void setDay(Integer day) {
		this.day = day;
	}


	public Integer getMonth() {
		return month;
	}


	public void setMonth(Integer month) {
		this.month = month;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getAssociatedClass() {
		return associatedClass;
	}


	public void setAssociatedClass(String associatedClass) {
		this.associatedClass = associatedClass;
	}


	public boolean isComplete() {
		return isComplete;
	}


	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}


	
}