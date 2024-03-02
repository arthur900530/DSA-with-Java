package Queues;

public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int first = 0;
    private int count = 0;
    private static final int CAPACITY = 100;

    public ArrayQueue(){this(CAPACITY);}
    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }

    public int size(){return count;}

    public boolean isEmpty(){return count == 0;}

    public void enqueue(E e) throws IllegalStateException{
        if (count == data.length) throw new IllegalStateException("Queue is full!");
        int next = (first + 1) % data.length;
        data[next] = e;
        count++;
    }

    public E dequeue(){
        if (isEmpty()) return null;
        E answer = data[first];
        data[first] = null;
        first = (first + 1) % data.length;
        count--;
        return answer;
    }

    public E first(){
        if (isEmpty()) return null;
        return data[first];
    }
}
