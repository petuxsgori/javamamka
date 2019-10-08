package laba_4;

public class realize {
    Priceable ch=new cheburec(300,"вкусно очень");
    Priceable kk=new car(1488000,"бугатти");
    public realize(){
        System.out.println(ch.GetPrice()+" $ "+ch.GetParam());
        System.out.println(kk.GetPrice()+" $ "+kk.GetParam());
    }
}
