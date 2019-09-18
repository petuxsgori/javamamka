package laba_2;

public class Hand {
    private int lenght;
    private int width;
    private int palm_size;
    public Hand(int lenght,int width,int palm_size){
        this.lenght=lenght;
        this.width=width;
        this.palm_size=palm_size;
    }
    public String hand(){
        return "lenght hand: "+lenght+" cm, width hand: "+width+" cm, palm_size "+palm_size+" cm"+"\n";
    }
    public String anorexic(){
        if(width<5)return" anorexic or weak "+"\n";
        else return "not anorexic"+"\n";
    }
}
