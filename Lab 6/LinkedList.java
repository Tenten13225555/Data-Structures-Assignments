import java.util.ArrayList;

// Create the node class
class Node
{
     People persons;
     Node next;

    Node(People persons)
    {
        this.persons = persons;
    }
}


public class LinkedList {

    Node head;

    LinkedList()
    {
        this.head = null;
    }

    // creating the insertElement method 
    public void insertElement(People persons)
    {
        Node node = new Node(persons);

        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currentNode = this.head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }
    // creating the print method
    public void print()
    {
        Node currentNode = this.head;

        while (currentNode != null)
        {
            System.out.println(currentNode.persons.toString());
            currentNode = currentNode.next;
        }
    }

    // Creating the Linked List
    public ArrayList<LinkedList>  split(LinkedList list) {

        LinkedList vaccinated = new LinkedList();
        LinkedList unvaccinated = new LinkedList();
    
        ArrayList<LinkedList> split_list = new ArrayList<LinkedList>();

        Node currentNode = list.head;
        while(currentNode != null) {
            if (currentNode.persons.status.equals("Vaccinated")){
                vaccinated.insertElement(currentNode.persons);
            }
            else if (currentNode.persons.status.equals("Not Vaccinated")) {
                unvaccinated.insertElement(currentNode.persons);
            }

            currentNode = currentNode.next;
        }
// spliting the linked lists between vaccinated and unvaccinated
        split_list.add(vaccinated);
        split_list.add(unvaccinated);

        // returning the split list values
        return split_list;
    }

}




  
