// creating node class
class Node 
{ 
    Country country; 
    Node next; 
     
    Node(Country country) 
    { 
        this.country = country; 
    } 
} 
 
public class Driver { 
 // create displayLinkedList method
    public static void displayLinkedList(Node node) 
    { 
       
        Node flag = node;

        while(flag!= null) {

            System.out.println(cur.country);

            flag = flag.next;
        
        }
    } 
  // create sortDescending method
    public static Node sortDescending(Node head)  
    { 
      
        if (head.next == null)

        return head;

        Node max = head;

        Node toMax = null; 

        Node flag = head;

        while (flag.next!= null) {

            if (flag.next.country.population > max.country.population) {

                max = flag.next;

                toMax = flag;
            }
            flag = flag.next;
             }
             
            if (max!= head) {
                Node head_ref = max;

                Node temp = max.next;

                toMax.next = head;
                
                max.next = head.next;

                head.next = temp;

                head = head_ref;
            }

            head.next = sortDescending(head.next);

            // return head value 
            return head;
        }
    
    
 
    public static void main(String[] args) { 
 
        Node head = new Node(new Country("Australia", 25499884)); 
        head.next = new Node(new Country("Canada", 37742154)); 
        head.next.next = new Node(new Country("United States", 338289857)); 
        head.next.next.next = new Node(new Country("India", 1417173173)); 
        head.next.next.next.next = new Node(new Country("China", 1425887337)); 
 
        System.out.println("\nOriginal Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(head); 
 
        System.out.println("\nSorted Linked List:"); 
        System.out.println("*********************"); 
        displayLinkedList(sortDescending(head)); 
    } 
} 
 