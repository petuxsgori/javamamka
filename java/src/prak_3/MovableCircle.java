package prak_3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
        this.radius=radius;
    }
    public void MoveUp(){center.y=center.y+center.ySpeed;};
    public void MoveDown(){center.y=center.y-center.ySpeed;};
    public void MoveLeft(){center.x=center.x-center.xSpeed;;};
    public void MoveRight(){center.x=center.x+center.xSpeed;};
}
