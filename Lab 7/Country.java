public class Country {
 // Creating the variables
    String name;
    double population; 

//Creating the parameterized constructor
   public Country(String name,  double population) {

this.name = name;
this.population = population; 


}
// Override method 
@Override 

 // Creating the toString method
public String toString() {
    
    // return name and population values 

    return name + ":" + population;

    }
}