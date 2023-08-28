public class People {
  // Creating the variables
    String name;
    int age;
    String status;

    //Creating the parameterized constructor
    public People (String name, int age, String status) {

        this.name = name;
        this.age = age;
        this.status = status;
    }
    // Creating the toString method
    public String toString() {

        return name + ", " + age + ", " + status;



    }
}
