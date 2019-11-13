package prak_8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity=capacity;
        lel=new ConcurrentLinkedQueue<E>();
    }
    public int getCapacity(){
        return capacity;
    }
    public void add(Object element){
        if(lel.size()<capacity)lel.add(element);
        else System.out.println("в список BoundedWaitList невозможно добавить символ");
    }
    public String toString(){
        return lel.toString();
    }
}
