import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) { 
// Insert elements from the linked lists
        LinkedList list = new LinkedList(); 
        list.insertElement(new People("Steve Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Bill Gates", 65, "Vaccinated")); 
        list.insertElement(new People("Angelina Jolie", 50, "Not Vaccinated")); 
        list.insertElement(new People("Warren Buffet", 75, "Not Vaccinated")); 
        list.insertElement(new People("Tim David", 35, "Vaccinated")); 
        list.insertElement(new People("Lizzy Stone", 25, "Vaccinated")); 
        list.insertElement(new People("Eva Jobs", 55, "Not Vaccinated")); 
        list.insertElement(new People("Melinda Gates", 55, "Vaccinated")); 
        list.insertElement(new People("Elon Musk", 53, "Not Vaccinated")); 
 
        System.out.println("\nOriginal List"); 
        System.out.println("*********************"); 
        // print the original  linked list
        list.print();
 // Splitting the original list into vaccinated and unvaccinated lists
        ArrayList<LinkedList> sList = list.split(list);


        System.out.println("\nVaccinated People"); 
        System.out.println("*********************"); 
        // print the vaccinated linked list
        sList.get(0).print();
 
        System.out.println("\nUnvaccinated People"); 
        System.out.println("*********************"); 
        // print the unvaccinated linked list
        sList.get(1).print();
         

    } 
}