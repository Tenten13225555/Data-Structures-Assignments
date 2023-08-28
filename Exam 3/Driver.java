public class Driver {public static Node highPerformers(Node root, double start, double end) {
    // Fill in this function
    if (root == null) {
        return null;
    }
    // recursively removing employees
    root.left = highPerformers(root.left, start, end);
    root.right = highPerformers(root.right, start, end);

    if (root.data.rating < start || root.data.rating > end) {
        if (root.left != null) {
            return root.left;
        } else {
            return root.right;
        }
    }

    return root;
}

public static void preOrder(Node root)
{
    // Fill in this function
    //if - statements to remove from BST
    if (root == null) {
        return;
    }
    System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);
}
public static void sortDescending(Node root)
{
    // Fill in this function
    if (root == null) {
        return;
    }
    sortDescending(root.right);
    System.out.println(root.data);
    sortDescending(root.left);
}
public static void main(String[] args) {
    Node root = new Node(new Employee("John", 85));
    root.left = new Node(new Employee("Steve", 65));
    root.right = new Node(new Employee("Lizzy", 95));
    root.left.left = new Node(new Employee("Bill", 58));
    root.left.right = new Node(new Employee("Salma", 70));
    root.right.right = new Node(new Employee("Tim", 98));
    root.left.left.left = new Node(new Employee("Sheena", 55));
    root.left.left.right = new Node(new Employee("Jeff", 60));
    root.right.right.left = new Node(new Employee("Ben", 96));

    System.out.println("\nOriginal List of Employees");
    System.out.println("****************************");
    preOrder(root);

    System.out.println("\nList of High Performing Employees");
    System.out.println("************************************");
    preOrder(highPerformers(root, 65, 95));

    System.out.println("\nList of High Performing Employees in Sorted Order");
    System.out.println("***************************************************");
    sortDescending(highPerformers(root, 65, 95));
}
}

class Employee {
String name;
double rating;


public Employee(String name, double rating) {
    this.name = name;
    this.rating = rating;
}

public String toString() {
    return this.name + " " + this.rating;
}
}

class Node {
Employee data;
Node left;
Node right;

// parameterized constructor
public Node(Employee data) {
    this.data = data;
    this.left = null;
    this.right = null;
}
}


// Time complexity: O(n)
// Space complexity: O(1)