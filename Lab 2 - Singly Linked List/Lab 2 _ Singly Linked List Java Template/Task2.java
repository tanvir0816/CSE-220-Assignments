// Task02: Remove Compartment
public class Task2 {

    public static Node removeCompartment(Node head, int n){

        //You're not suppose to create any new Linked List for this task
        
        //TODO

        //this method will return the updated Head
        //remove the following line when you're ready to return
        return null;
    }
    
    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        //DO NOT TOUCH THE DRIVER CODE BELOW
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,2)");
        head = removeCompartment(head,2);
        System.out.println("Expected Compartment Sequence: 10-->15-->34-->41-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 10-->15-->34-->41-->72
        System.out.println();
        System.out.println("\n==============Test Case 2=============");
        head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,7)");
        head = removeCompartment(head,7);
        System.out.println("Expected Compartment Sequence: 10-->15-->34-->41-->56-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 10-->15-->34-->41-->56-->72
        System.out.println();
        System.out.println("\n==============Test Case 3=============");
        head = LinkedList.createList(  new Integer[]{10,15,34,41,56,72} );
        System.out.print("Original Compartment Sequence: ");
        LinkedList.printLL(head);
        System.out.println("\nMethod called: removeCompartment(head,6)");
        head = removeCompartment(head,6);
        System.out.println("Expected Compartment Sequence: 15-->34-->41-->56-->72");
        System.out.print("\nYour Compartment Sequence: ");
        LinkedList.printLL(head); //This should print 15-->34-->41-->56-->72
        System.out.println();
    }

}
