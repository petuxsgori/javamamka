package prak_6;


public class Student {
    public double srednii_ball;
    public String name_student;
    public Student(double sr_bl,String name){
        srednii_ball=sr_bl;
        name_student=name;
    }

    @Override
    public String toString() {
        return name_student+"  "+srednii_ball;
    }
}
