package model;
public class MyTriangle {
    MyPoint p1, p2, p3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public float getPerimeter(){
        float line1 = p1.distance(p2);
        float line2 = p1.distance(p3);
        float line3 = p2.distance(p3);

        return line1 + line2 + line3;
    }

    public String getType(){
        float line1 = p1.distance(p2);
        float line2 = p1.distance(p3);
        float line3 = p2.distance(p3);

        if(line1 == line2 && line2 == line3 && line3 == line1){
            return "Equilatero";
        }
        else if(line1 != line2 && line2 != line3 && line3 != line1){
            return "Escaleno";
        }
        else{
            return "Isosceles";
        }
    }


    public String toString(){
        return "(" + this.p1.toString() + ", " + this.p2.toString() + ", " + this.p3.toString() + ")";
    }



    //Getters and setters

    public void setP1(MyPoint p){
        this.p1 = p;
    }

    public void setP2(MyPoint p){
        this.p2 = p;
    }

    public void setP3(MyPoint p){
        this.p3 = p;
    }


    public MyPoint getP1(){
        return this.p1;
    }

    public MyPoint getP2(){
        return this.p2;
    }

    public MyPoint getP3(){
        return this.p3;
    }
}
