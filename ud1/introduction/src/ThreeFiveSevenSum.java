public class ThreeFiveSevenSum {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        for(int i=1; i<100; i++){
            //if((i % 3 == 0 || i % 5 == 0 || i % 7 == 0) && !(i % 15 == 0 || i % 21 == 0 || i % 35 == 0 || i % 105 == 0)){
            if((i % 3 == 0 || i % 5 == 0 || i % 7 == 0) && (i % 15 != 0 && i % 21 != 0 && i % 35 != 0 && i % 105 != 0)){
                suma = i + suma;
                System.out.println("Gehitutako zenbakia: " + i);
                System.out.println(suma);
            }
        }
    }
}