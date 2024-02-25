public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        // Create a SinglyLinkedList instance
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Add some elements to the list
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        // Display the current list
        System.out.println("List size: " + list.size());
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        // Remove the first element
        Integer removedElement = list.removeFirst();
        System.out.println("Removed element: " + removedElement);

        // Display the list after removal
        System.out.println("List size after removal: " + list.size());
        System.out.println("First element after removal: " + list.first());
        System.out.println("Last element after removal: " + list.last());
    }
}
