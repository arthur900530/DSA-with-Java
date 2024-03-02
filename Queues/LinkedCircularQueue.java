package Queues;
import LinkedLists.CircularlyLinkedList;

public class LinkedCircularQueue<E> implements CircularQueue<E> {
    private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();
    public LinkedCircularQueue(){}
    public int size(){return list.size();}
    public boolean isEmpty(){return list.isEmpty();}
    public void enqueue(E e){list.addLast(e);}
    public E dequeue(){return list.removeFirst();}
    public E first(){return list.first();}
    public void rotate(){list.rotate();}
}
