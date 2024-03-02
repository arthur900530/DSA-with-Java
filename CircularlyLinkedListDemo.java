import LinkedLists.CircularlyLinkedList;
public class CircularlyLinkedListDemo {
    public static void main(String[] args) {
        // Create a CircularlyLinkedList for Integer elements
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();

        // Add elements to the list
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Printing the elements in the list
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        // Rotate the list
        list.rotate();
        System.out.println("First element after rotation: " + list.first());
        System.out.println("Last element after rotation: " + list.last());

        // Remove an element from the list
        System.out.println("Removed element: " + list.removeFirst());
        System.out.println("First element after removal: " + list.first());
    }
}
