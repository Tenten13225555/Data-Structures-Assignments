
import java.util.Stack;

//craeting the class with the instance variables 
class Student {
    String name;
    int age;

    //building the parameterized constructor 
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // returning the string value 
    public String toString() {
        return name + ": " + age;
    }
}

class Node {
    Student student;
    Node left;
    Node right;

    Node(Student student) {
        this.student = student;
    }
}

public class Driver {

    static int sum;
    static int count;

    public static void getAverageAge(Node node) {

        //calculates the average age of the students 
        int average = getAverage(node);
        
        // used to print out the average age 
        System.out.println("Average Age of Students: " + average);
    }

    public static int getAverage(Node root) {

        //if statement that returns a value of 0 if the root is null
        if (root == null) {
            return 0;
        }
    
        // the variables, sum and count were initialized
        sum = 0;
        count = 0;

        //forms a stack of Node objects
        Stack<Node> stack = new Stack<>();
        
        stack.push(root);
        //loop while stack is not empty
        while (!stack.isEmpty()) {
            //pop a node from the stack
            Node node = stack.pop();
            //add the age of the student to sum
            sum += node.student.age;

            //increment count by 1 each time it loops
            count = count + 1;

            //if the statement was fufilled, push it to the stack
            if (node.left != null) {
                stack.push(node.left);
            }
            //if the statement was fufilled, push it to the stack
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        //returns the average age
        return sum / count;
    }

    public static Node getMinimum(Node root) {
       
        if (root == null || root.left == null) {
            return root;
        }
        
        return getMinimum(root.left);
    }

    public static Node getMaximum(Node root) {
        
        if (root == null || root.right == null) {
            return root;
        }
        //else move to the right child
        return getMaximum(root.right);
    }

    public static void printNodes(Node root) {
        
        if (root != null) {
            //prints left subtree
            printNodes(root.left);
            //print the student of the current node
            System.out.println(root.student);
            // prints right tree
            printNodes(root.right);
        }
    }

    public static void main(String[] args) { 
 
        Node root = new Node(new Student("Steve Jobs", 55)); 
        root.left = new Node(new Student("Elon Musk", 45)); 
        root.right = new Node (new Student("Bill Gates", 75)); 
        root.left.left = new Node (new Student("Ben Stokes", 40)); 
        root.left.right = new Node (new Student("Angelina Jolie", 48)); 
        root.right.left = new Node(new Student("Warren Buffet", 72)); 
        root.right.right = new Node(new Student("Lizzy Bank", 80));   
         
        System.out.println("\nList of Students"); 
        System.out.println("***********************"); 
        printNodes(root); 
 
        System.out.println("\nClass Statistics"); 
        System.out.println("***********************"); 
        System.out.println("Youngest Student: " + getMinimum(root).student.toString()); 
        System.out.println("Oldest Student: " + getMaximum(root).student.toString()); 
        System.out.println("Average Age of Students: " + getAverage(root)); 
    } 
} 
 
 