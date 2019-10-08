package laba_4;

public class cheburec implements Priceable {
    private int Price;
    private String taste;
    public cheburec(int Price,String taste){
        this.Price=Price;
        this.taste=taste;
    }
    public int GetPrice() {
        return Price;
    }
    public String GetParam(){
        return taste;
    }
}
