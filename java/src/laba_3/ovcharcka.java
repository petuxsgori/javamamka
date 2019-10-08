package laba_3;

public class ovcharcka extends Dog{
    public ovcharcka(int size,float weight,int age,String name){
        this.size=size;
        this.weight=weight;
        this.age=age;
        this.name=name;
    }

    public void makeSound() {
        System.out.println(name+" говорит гаф");
    }
    public void fat() {
        if(size<15*weight)System.out.println(name+" - жирная");
        else System.out.println(name+" - худая");
    }
    public void Get() {
        System.out.println(this);
    }
    public String toString() {
        return size+" см, "+weight+" кг "+age+" лет "+name;
    }
}
