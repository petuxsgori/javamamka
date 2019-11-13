package prak_8;
import java.util.Collection;
public interface IWaitList <E>{
    public void add(E element);
    public E remove();
    public boolean contains(Object element);
    public boolean containsALL(Collection <E> c);
    public boolean isEmpty();
}
