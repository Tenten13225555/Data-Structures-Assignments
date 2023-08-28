public abstract class Cd {

	// class attributes
	protected String performers;
	protected String label;
	protected int selections;
	protected double playtime;
	
	// default constructor
	public Cd() {
		this.performers = "Unknown";
		this.label = "Unknown";
		this.selections = 0;
		this.playtime = 0.0;
	}
	
	// parameterized constructor
	public Cd(String performers, String label, int selections, double playtime) {
		this.performers = performers;
		this.label = label;
		this.selections = selections;
		this.playtime = playtime;
	}
	
	// abstract method
	abstract void Report();
}


    

