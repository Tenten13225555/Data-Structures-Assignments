import java.util.ArrayList;
import java.util.PriorityQueue;

public class Driver {

	public static ArrayList<String> classifyAthletes(Athlete[] athletes) {

		// Creating the Priority queue 
		PriorityQueue<Athlete> queue = new PriorityQueue<>((athlete1, athlete2) -> {
			return athlete2.obtainWins() - athlete1.obtainWins();
		});

		// add the athletes to queue
		for (Athlete athlete : athletes) {
			queue.add(athlete);
		}

		// Creates ArrayList
		ArrayList<String> result = new ArrayList<>();

		int i = 1;

		// while-loop will run until the queue is empty
		while (!queue.isEmpty()) {

			// obtain the name of current Athlete
			String temp = queue.remove().obtainName();
			temp += ": ";

			

			// if it is first Athlete from queue, then attach "Highest Wins" to it
			if (i == 1) {
				
				temp += "Highest Wins";
			}
			// if it is seconnd Athlete from queue, then attach "Second Highest Wins" to it
			else if (i == 2) {
				
				temp += i + "nd Highest Wins";
			}

			// if it is third Athlete from queue, then attach "Third Highest Wins" to it
			else if (i == 3) {
				
				temp += i + "rd Highest Wins";
			}

			// if it is after the 3rd Athlete from queue, then attach the incrementetd value to "th Highest Wins" to it
			else {
				
				temp += i + "th Highest Wins";
			}

			
			result.add(temp);
			// increment i by 1
			i = i +1;

		}
		// return the result value
		return result;

	}

    
        public static void main(String[] args) { 
 
            Athlete[] athletes = new Athlete[]{ 
                new Athlete("Pete Sampras", 14), 
                new Athlete("Novak Djokovic", 21), 
                new Athlete("Roger Federer", 20), 
                new Athlete("Roy Emerson", 12), 
                new Athlete("Rafael Nadal", 22), 
                new Athlete("Bjorn Borg", 11), 
            }; 
     
            for (String rank: classifyAthletes(athletes)) 
            { 
                System.out.println(rank); 
            } 
             
        } 
} 