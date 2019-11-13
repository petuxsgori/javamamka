package prak_8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
public class WaitList <E> implements IWaitList {
    public ConcurrentLinkedQueue<E> lel=null;
    public WaitList(){
        lel=new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> c){
        lel=new ConcurrentLinkedQueue<E>();
        lel.addAll(c);
    }
    public void add(Object element) {
        lel.add((E) element);
    }
    public Object remove() {
        return lel.remove();
    }
    public boolean contains(Object element) {
        return lel.contains(element);
    }
    public boolean containsALL(Collection c) {
        return lel.containsAll(c);
    }
    public boolean isEmpty() {
        return lel.isEmpty();
    }
    public String toString(){
        return lel.toString();
    }
}
