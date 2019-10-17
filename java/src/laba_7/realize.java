package laba_7;
import java.util.Collections;
import java.util.LinkedList;
public class realize {
    private LinkedList<Integer> a=new LinkedList<Integer>();
    private LinkedList<Integer> b=new LinkedList<Integer>();
    private LinkedList<Integer> c=new LinkedList<Integer>();
    public realize(){
        for(int i=0;i<15;i++){
            a.add((int)(Math.random()*100));
            b.add((int)(Math.random()*100));
        }
        a.addFirst(1);
        b.addLast(100);
        System.out.println("элементы списка а с добавлением первого элемента 1: ");
        vivod(a);
        System.out.println("\n элементы списка b с добавлением последнего элемента 100: ");
        vivod(b);
        for(int i=0;i<6;i++) {
            a.remove((int) (Math.random() * (a.size() - 1)));
            b.remove((int) (Math.random() * (b.size() - 1)));
        }
        System.out.println("\nэлементы списка a после удаления 6-ти случайных элементов:\n ");
        vivod(a);
        System.out.println("\n элементы списка a после удаления 6-ти случайных элементов:\n ");
        vivod(b);
        c.addAll(a);
        c.addAll(b);
        System.out.println("\nэлементы списка c после добавления в него списков a & b:\n ");
        vivod(c);
        Collections.sort(c);
        System.out.println("\nэлементы списка c после сортировки:\n ");
        vivod(c);

    }
    public static void vivod(LinkedList<Integer> a){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
