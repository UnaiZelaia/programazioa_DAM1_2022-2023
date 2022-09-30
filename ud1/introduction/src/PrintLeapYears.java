public class PrintLeapYears {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int LOWERBOUND = 999;
        int UPPERBOUND = 2023;
        for(int i = LOWERBOUND; i < UPPERBOUND; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                count ++;
                System.out.println(i);
            }
        }
        System.out.println("Numero de años bisiestos: " + count);
    }
}
