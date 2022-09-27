public class Product1ToN{
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        int product = 1;

        for(int number = LOWERBOUND; number < UPPERBOUND; number ++){
            product = product * number;
            System.out.println(product);
        }
        System.out.println("Esto es un cambio 2");
    }
}