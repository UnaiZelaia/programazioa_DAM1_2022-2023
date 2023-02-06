package model;

public class MyCircle {
    MyPoint center;
    int radius;

    /*******************Constructors*******************************/ 
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int r) {
        this.center = new MyPoint(x, y);
        this.radius = r;
    }

    public MyCircle(MyPoint p, int r) {
        this.center = p;
        this.radius = r;
    }
    /***************************************************************/


    public double distance(MyCircle c) {
        return this.center.distance(c.center);
    }

    public boolean isInside(MyPoint p) {
        if (p.distance(this.center) < radius) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "[radius=" + this.radius + ", center=" + this.center.toString() + "]";
    }


    // Getters
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return Math.PI * (2 * this.radius);
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public float getCenterX() {
        return this.center.getX();
    }

    public float getCenterY() {
        return this.center.getY();
    }

    public float[] getCenterXY() {
        float xy[] = new float[2];
        xy[0] = this.center.getX();
        xy[1] = this.center.getY();
        return xy;
    }

    public int getRadius() {
        return radius;
    }

    // Setters
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
