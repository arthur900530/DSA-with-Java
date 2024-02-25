public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Adding elements
        System.out.println("Adding elements:");
        list.addFirst(10);
        System.out.println("First element (added 10): " + list.first());
        list.addLast(20);
        System.out.println("Last element (added 20): " + list.last());
        list.addFirst(30);
        System.out.println("First element (added 30 at the beginning): " + list.first());
        list.addLast(40);
        System.out.println("Last element (added 40 at the end): " + list.last());

        // Display the size of the list
        System.out.println("Current size of the list: " + list.size());

        // Removing elements
        System.out.println("\nRemoving elements:");
        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("First element now: " + list.first());
        System.out.println("Removed last element: " + list.removeLast());
        System.out.println("Last element now: " + list.last());

        // Display the size of the list after removals
        System.out.println("Size of the list after removals: " + list.size());
    }
}
