public class RectangleComputation {
    public static void main(String[] args) {
        
        double length = 2.55;
        double width = 4.45;

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);

        System.out.println("The rectangle with width " + width + " and length " + length);
        System.out.println("has an area of " + area + " and a perimeter of " + perimeter);
        
    }
}
