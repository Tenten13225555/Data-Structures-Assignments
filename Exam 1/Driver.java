import java.util.HashMap;

// Node class for storing student information
class Student {
    String name;
    char grade;
    
    
    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
    }
    
    public class Driver {
    
   
    // Function to calculate passing rate of students
    // Takes in an array of Student objects
    public static double getPassingRate(Student[] students) {
        // Hashmap to store number of students with each grade
        HashMap<Character, Integer> grades = new HashMap<>();
        // Initialize grades to 0
        grades.put('A', 0);
        grades.put('B', 0);
        grades.put('C', 0);
        grades.put('D', 0);
        grades.put('F', 0);
    
        // Loop through students and increment grade count in hashmap
        for (Student s : students) {
            grades.put(s.grade, grades.get(s.grade) + 1);
        }
    
        // Calculate passing rate by dividing number of passing grades
        // (A, B, C, D) by total number of students
        int passingGrades = grades.get('A') + grades.get('B') + grades.get('C') + grades.get('D');
        int totalStudents = students.length;
        double passingRate = (double) passingGrades / totalStudents * 100;
    
        return passingRate;
    }
    
    public static void main(String[] args) {
        Student[] students  = new Student[]{
            new Student("Steve", 'A'),
            new Student("Bill", 'F'),
            new Student("Elon", 'C'),
            new Student("Lizzy", 'F'),
            new Student("Salma", 'D'),
            new Student("Jeff", 'F'),
            new Student("Warren", 'B'),
            new Student("Julie", 'F'),
            new Student("Shawn", 'A'),
            new Student("Tim", 'C'),
        };
    
        System.out.println("Passing Rate with 10 students: " + getPassingRate(students) + "%");
        
        students = new Student[]{};
        System.out.println("Passing Rate with 0 students: " + getPassingRate(students) + "%");
    
    }
    }
    // Time Complexity O(n)
    // Space Complexity O(1)