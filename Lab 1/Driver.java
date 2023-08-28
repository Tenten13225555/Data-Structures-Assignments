// Creating the driver class 
public class Driver {
    public static void main (String[] args) {
    
    // Creating an object for the Calculator class
        Calculator calc = new Calculator();

        // Defining the variables of x and y
        double x = 5.0;
        double y = 6.0;

        // calls on the add method
        double addition = calc.add(5.0,6.0);

        // calls on the multiply method
        double multiplied = calc.multiply(5.0,6.0);

        // Printing the addition method 
        System.out.printf("%.1f\n" , addition); 

        // Printing the muliplication method
        System.out.printf("%.1f\n", multiplied); 
}
}

