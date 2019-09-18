package prak_6;
import java.util.Arrays;
public class realize {
    public realize() {
       Student[] st=new Student[5];
       st[0]=new Student(2.8,"ivan");
       st[1]=new Student(4.5,"pyvel");
       st[2]=new Student(3.4,"fufel");
       st[3]=new Student(1,"batya");
       st[4]=new Student(4.9,"papasha");
       Arrays.sort(st,new SortingStudentsByGPA());
       for(int i=0;i<st.length;i++){
           System.out.println(st[i]);
       }
    }
}
