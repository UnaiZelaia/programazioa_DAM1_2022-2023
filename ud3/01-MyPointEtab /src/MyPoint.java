import java.lang.Math;

public class MyPoint{
    float x, y;


    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float distance(){
        float distanceX = (float)Math.pow(this.x, 2);
        float distanceY = (float)Math.pow(this.y, 2);
        float distance = (float)Math.sqrt(distanceX + distanceY);

        return distance;
    }

    public float distance(MyPoint p){
        float distanceX = (float)Math.pow(p.x - this.x, 2);
        float distanceY = (float)Math.pow(p.y - this.y, 2);
        float distance = (float)Math.sqrt(distanceX + distanceY);

        return distance;
    }

    public float distance(int x, int y){
        float distanceX = (float)Math.pow(x - this.x, 2);
        float distanceY = (float)Math.pow(y - this.y, 2);
        float distance = (float)Math.sqrt(distanceX + distanceY);

        return distance;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }


    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public float[] getXY(){
        float puntuak[] = new float[2];
        puntuak[0] = this.x;
        puntuak[1] = this.y;
        return puntuak;
    }

    public String toString(){
        return "[" + this.x + ", " + this.y + "]";
    }
}