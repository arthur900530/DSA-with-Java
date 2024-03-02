package Stacks;

import java.nio.channels.IllegalSelectorException;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 100;
    private E[] data;
    private int count = -1;

    public ArrayStack(){ this(CAPACITY); }
    public ArrayStack(int capacity){ data = (E[]) new Object[capacity]; }

    public int size(){ return count + 1; }

    public boolean isEmpty(){ return count == -1; }

    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is full!");
        data[++count] = e;
    }

    public E pop(){
        if (isEmpty()) return null;
        E answer = data[count];
        data[count] = null;
        count--;
        return answer;
    }

    public E top(){
        if (isEmpty()) return null;
        return data[count];
    }
}
