package prak_6;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.srednii_ball>o2.srednii_ball)return -1;
        if(o1.srednii_ball==o2.srednii_ball)return 0;
        return 1;
    }
}
