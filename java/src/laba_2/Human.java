package laba_2;

public class Human {
    public String color;
    public Legs legs;
    public Hand hand;
    public Head head;
    Human(String color,Legs legs,Hand hand, Head head){
        this.color=color;
        this.legs=legs;
        this.hand=hand;
        this.head=head;
    }
    public String description(){
        return color+"\n"+legs.legs()+legs.disabled()+hand.hand()+hand.anorexic()+head.clr()+head.Asian()+head.hipster();
    }
}
