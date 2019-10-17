package prak_7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class realize {
    public ArrayDeque<Integer> first=new ArrayDeque<Integer>();
    public ArrayDeque<Integer> second=new ArrayDeque<Integer>();
    public ArrayList<Integer> shuf=new ArrayList<Integer>();
    public int[] razd=new int[10];
    public int a;
    public int shet=0;
    public realize(){
        for(int i=0;i<10;i++) {
            razd[i]=i;
            shuf.add(i);
        }
        System.out.println(razd.length);
        Collections.shuffle(shuf);
        for(int i=0;i<5;i++){
            first.add(shuf.get(i));
            second.add(shuf.get(i+5));
        }
        while(!((first.size()==10)||(second.size()==10))&&(shet!=105)){
            shet++;
            System.out.println(first.getFirst()+" "+second.getFirst()+" Size first "+first.size()+" size second "+second.size());
            if((first.getFirst()>second.getFirst())||(first.getFirst()==9&&second.getFirst()==0)){
                first.addLast(second.getFirst());
                first.addLast(first.getFirst());
                second.removeFirst();
                first.removeFirst();
            }
            else if((first.getFirst()<second.getFirst())||(first.getFirst()==0&&second.getFirst()==9)){
                second.addLast(first.getFirst());
                second.addLast(second.getFirst());
                second.removeFirst();
                first.removeFirst();
            }
        }
        if(first.size()==10)System.out.println("победил первый");
        if(second.size()==10)System.out.println("победил второй");
        if(shet==105)System.out.println("БАТВА");
    }
    public void prov(){
        a = ((int) (Math.random() * (10)));
        while(razd[a]==-1) {
            a = ((int) (Math.random() * (10)));
        }
    }
}
