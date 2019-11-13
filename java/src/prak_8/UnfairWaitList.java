package prak_8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList {
    public UnfairWaitList(){
        lel=new ConcurrentLinkedQueue<E>();
    }

    public void remove(Object element) {
        if(lel.contains(element))
            lel.remove(element);
        //else System.out.println("такого элемента нет в списке");
    }
    public void moveToBack(Object element) {
        if (lel.contains(element)) {
            lel.add(element);
            lel.remove(element);
        }
        //else System.out.println("такого элемента нет");
    }
}
