// creating child class Classic
public class Classic extends Cd {

	// class attribute
	private String primaryWork;
	
	// default constructor 
	public Classic(){
		// also calling parent class constructor using super
		super();
		this.primaryWork = "Unknown";
	}
	
	// parameterized constructor
	public Classic(String primaryWork, String performers, String label, int selections, double playtime) {
		// also calling parent class constructor using super
		super(performers,label,selections,playtime);
		this.primaryWork = primaryWork;

		if (primaryWork == "null") {
			System.out.println("Unknown");
		}
	}
	
	// overridden method Report() to display information of Cd on the screen
	@Override
	void Report() {
		System.out.println("Performers: " + performers);
		System.out.println("Label: " + label);
		System.out.println("Selections: " + selections);
		System.out.println("PlayTime: " + playtime);
		System.out.println("Primary Work: " + primaryWork);
	}
}
