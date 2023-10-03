public class CollegeCourse {
	// protected data fields so that they can be accessed in subclasses as well. We need to access these properties in the subclass so that we can display the data and update the data as we don't have dedicated mutator and accessor methods
	protected String courseNumber;
	protected String courseName;
	protected double contactHours;
	protected double creditHours;
	constant double COST_PER_HOUR;
	
	// constructor to init the values
	public CollegeCourse(String dept, int id, double credits) {
		// assigning the values
		this.cn = courseNumber;
		this.cna = courseName;
		this.credits = contactHours;
		
		// calculating and assigning the fees
		price = credits * 120;
	}
	
	// method to display the course data
	public void display() {
		System.out.println(cn + cna);
		System.out.println("Non-lab course");
		System.out.println(credits + " credits");
		System.out.println("Total fee is $" + price);
	}
}
