package laba_2;

public class Legs {
    private boolean move;
    private int lenght;
    private int width;
    private int foot_size;
    public Legs(boolean move,int lenght,int width,int foot_size){
        this.move=move;
        this.lenght=lenght;
        this.width=width;
        this.foot_size=foot_size;
    }
    public String legs(){
        return "lenght legs: "+lenght+" cm, width lengs: "+width+" cm, foot_size "+foot_size+" cm"+"\n";
    }
    public String disabled(){
        if(move)return" not disabled "+"\n";
        else return" disabled "+"\n";
    }
}
