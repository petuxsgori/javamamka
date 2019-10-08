package laba_3;

public class realize {
    public tacksa sobacka;
    public ovcharcka sobaka2;
    public realize(){
        sobacka=new tacksa(60,5,14,"sychi");
        sobaka2=new ovcharcka(100,15,10,"pipska");
        sobacka.Get();
        sobaka2.Get();
        sobacka.fat();
        sobaka2.fat();
        sobacka.makeSound();
        sobaka2.makeSound();
    }
}
