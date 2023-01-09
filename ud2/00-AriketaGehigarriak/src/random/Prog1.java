package random;

public class Prog1{
    public static void main(String[] args) {
        System.out.printf("\n\n\n%2s %s \n", "    ", "Math.random()");
        System.out.printf("================================================================================================================\n");

        for(int i = 1; i<=20; i++){
            System.out.printf("%2d)      %6f", i, Math.random());
            System.out.printf("\n\n");
        }
    }
}