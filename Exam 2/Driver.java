public class Driver {
    public static Node reverseList(Node head)
    {
    // create a new node to store the reversed list
    Node reversed = null;
    
  
        // traverse the given list and insert each node at the beginning of the reversed list
        while (head != null) {
            // store the current node in a temp variable
            Node temp = head;
            // move the head to the next node in the list
            head = head.next;
            // insert the temp node at the beginning of the reversed list
            temp.next = reversed;
            reversed = temp;
        }
    
        // return the reversed list
        return reversed;
    }
    
    public static void printList(Node head)
    {
        // traverse the list and print each node's data
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
    
        // Test Case 1
        Node head = new Node("Toronto");
        head.next = new Node("Ottawa");
        head.next.next = new Node("Oshawa");
        head.next.next.next = new Node("Whitby");
        head.next.next.next.next = new Node("Ajax");
        head.next.next.next.next.next = new Node("Markham");
        head.next.next.next.next.next.next = new Node("Mississauga");
        head.next.next.next.next.next.next.next = new Node("Niagara");
        head.next.next.next.next.next.next.next.next = new Node("London");
        head.next.next.next.next.next.next.next.next.next = new Node("Barrie");
    
        System.out.println("\nTest Case 1: List with 10 city names");
        System.out.println("******************************");
        printList(head);
    
        System.out.println("\nReversed List:");
        printList(reverseList(head));
    
        // Test Case 2
        head = null;
    
        System.out.println("\n\nTest Case 2: List with no city names");
        System.out.println("******************************");
        printList(head);
    
        System.out.println("\nReversed List:");
        printList(reverseList(head));
    
        // Test Case 3
        head = new Node("Toronto");
    
        System.out.println("\n\nTest Case 3: List with only one city name");
        System.out.println("******************************");
        printList(head);
    
        System.out.println("\nReversed List:");
        printList(reverseList(head));
    }
    }
    
    class Node {
    // data to be stored in the node
    String data;
    // pointer to the next node in the list
    Node next;
    
    
    // constructor to initialize the node with given data
    Node(String data) {
        this.data = data;
        this.next = null;
    }
    }

   
  // Time Complexity: O(n)
            // Space Complexity: O(1)

