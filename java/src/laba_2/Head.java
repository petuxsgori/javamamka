package laba_2;

public class Head {
    private String color_eye;
    private String color_hair;
    private boolean narrow_eyes;
    private int lenght_beard;
    public Head(String color_eye,String color_hair,boolean narrow_eyes,int lenght_beard){
        this.color_eye=color_eye;
        this.color_hair=color_hair;
        this.narrow_eyes=narrow_eyes;
        this.lenght_beard=lenght_beard;
    }
    public String Asian(){
        if(narrow_eyes)return " Asian"+"\n";
        else return " not asian"+"\n";
    }
    public String clr(){
        return "color eyes: "+color_eye+" color hair: "+color_hair+"\n";
    }
    public String hipster(){
        if(lenght_beard>0)return " hipster "+"\n";
        else return " not hipster "+"\n";
    }
}
