public class Morgan {
    public static void main(String[] args) {
        int suma = 0;

        for(int i = 0; i <= 100; i++){
            if((i % 3 == 0 || i % 5 == 0) && (i % 10 != 0 || i % 9 != 0)){ 
                System.out.println("Gehitutako zenbakia: " + i);
                suma = suma + i;
                System.out.println(suma);
            }
        }
    }
}
