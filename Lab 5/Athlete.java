public class Athlete {

	// defining variables
	private String name;
	private int Wins;

    // building the parameterized constructors
	public Athlete(String name, int Wins) {
		this.name = name;
		this.Wins = Wins;
	}

	// method for getting names
	public String obtainName() {
		return name;
	}

	// method for setting names
	public void placeName(String name) {
		this.name = name;
	}

	// metthod for getting wins
	public int obtainWins() {
		return Wins;
	}

	// method for setting wins
	public void placeWins(int Wins) {
		this.Wins = Wins;
	}

	// Override the built-in compareTo method
	@Override
	public String toString() {
		return "Athlete [name=" + name + ", wins=" + Wins + "]";
	}

}







