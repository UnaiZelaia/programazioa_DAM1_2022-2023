public class test {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(6, 0);
        MyPoint p3 = new MyPoint(3, 5.196152f);
        MyPoint p4 = new MyPoint(4, 6);
        MyPoint p5 = new MyPoint(6, 5);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        
        System.out.println(t1.getType()); 
        System.out.println(t1.toString());

        MyRectangle r1 = new MyRectangle(p4, p5);

        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimetre of the rectangle: " + r1.getPerimetre());
    }
}
