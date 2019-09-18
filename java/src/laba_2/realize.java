package laba_2;

public class realize {
    Legs firstLe=new Legs(true,90,20,27);
    Hand firstHa=new Hand(60,10,15);
    Head firstHe=new Head("black","yellow",true,0);
    public Human man=new Human("white",firstLe,firstHa,firstHe);
    public realize(){
        System.out.println(man.description());
    }
}
