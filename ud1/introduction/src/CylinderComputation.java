public class CylinderComputation {
    public static void main(String[] args) {
            double radius, baseArea, circumference, height, volume, surfArea;

            final double PI = 3.14159265;

            radius = 1.2;
            height = 5.5;

            baseArea = (radius * radius) * PI;
            circumference = 2 * radius * PI;

            volume = baseArea * height;
            surfArea = (baseArea * 2) + (circumference * height);

            System.out.println("For a cylinder with radius: " + radius + " and height: " + height);
            System.out.println("The base area is: " + baseArea);
            System.out.println("The circumference is: " + circumference);
            System.out.println("The volume is: " + volume);
            System.out.println("The surface area is: " + surfArea);
    }
}
