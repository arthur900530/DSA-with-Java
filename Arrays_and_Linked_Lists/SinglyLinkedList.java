public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement(){return element;}
        public Node<E> getNext(){return next;}
        public void setNext(Node<E> n){next = n;}
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){};

    public int size(){return size;}

    public boolean isEmpty(){return size == 0;}

    public E first() {
        return isEmpty() ? null : head.getElement();
    }
    
    public E last() {
        return isEmpty() ? null : tail.getElement();
    }    

    public void addFirst(E e){
        head = new Node<>(e, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        E delElement = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) tail = null;
        return delElement;

    }
}
