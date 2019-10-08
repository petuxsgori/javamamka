package laba_4;

public class car implements Priceable {
    private int Price;
    private String brand;
    public car(int Price,String brand){
        this.Price=Price;
        this.brand=brand;
    }
    public int GetPrice() {
        return Price;
    }
    public String GetParam() {
        return brand;
    }
}
