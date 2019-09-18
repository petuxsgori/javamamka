package prak_7;
import java.util.Queue;

public class realize {
   // Queue<Integer> first = new Queue<Integer>();
    Queue second=null;
    public int mass[];
    public realize(){
        mass=new int[]{0,1,2,3,4,5,6,7,8,9};
        queueRe();
    }
    public void queueRe(){
        int x=0;
        for(int i=0;i<10;i++){
            x=0+(int)( Math.random()*10);
            mass[x]=-1;
            while(mass[x]==-1)x=0+(int)( Math.random()*10);
            /*if(i%2==0) first.add(x);
            else second.add(x);
            System.out.println(x);*/
        }
    }
}
