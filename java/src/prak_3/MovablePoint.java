package prak_3;

public class MovablePoint implements Movable {
    public int xSpeed;
    public int ySpeed;
    public int x;
    public int y;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void MoveUp(){y=y+ySpeed;};
    public void MoveDown(){y=y-ySpeed;};
    public void MoveLeft(){x=x-xSpeed;};
    public void MoveRight(){x=x+xSpeed;};
}
