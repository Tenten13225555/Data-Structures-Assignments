import java.util.ArrayList; 
import java.util.Arrays; 
 
public class Driver { 
 
    public static void selectionSort(ArrayList<Integer[]> tuples) 
    { 
         
    } 
 
    public static String[] sortTeams(String[] teams, int[] points)  
    { 
        // Fill in this method 
        // initializing the variables
        int y, lowest;
        int z = points.length;
        String tt;

// create for-loop to iterate through the lists
        for(int i=0; i<z-1; i++) {
            lowest = i;
// creating an additional for-loop to re-iterate through the lists
            for( int k = i+1; k<z; z++) {

                // if statement is created to compare the given ponts arrays
                if (points[z] > points[lowest]) {

                
            

                lowest = z;
            }

        }
         // interchange the elements in the points array
        y = points[i];
        points[lowest] = y;
        points[i] = points[lowest];
      

        // interchange the elements in the teams array
        teams[i] = teams[lowest];
        tt = teams[i];
        teams[lowest] = tt;
    
    }
    // creating the return value 
    return teams;

    }
    public static void main(String[] args)  
    { 
        String[] teams = new String[]{"Italy","Argentia", "England", "Brazil", "Belgium", 
"France", "Spain"}; 
        int[] points = new int[] {1726, 1773, 1728, 1841, 1816, 1759, 1715}; 
 
        System.out.println("\nOriginal Teams Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(teams)); 
 
        System.out.println("\nOriginal Points Array"); 
        System.out.println("********************"); 
        System.out.println(Arrays.toString(points)); 
 
        System.out.println("\nTeams Sorted by their points"); 
        System.out.println("*******************************"); 
        System.out.println(Arrays.toString(sortTeams(teams, points))); 
         
    } 
} 
 