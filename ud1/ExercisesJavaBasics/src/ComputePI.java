public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 50000;

        for(int i = 1; i < MAX_DENOMINATOR; i += 2){
            if(i % 4 == 1){
                sum += i;
            }
            else if(i % 4 == 3){
                sum -= i;
            }
            else{
                System.out.println("impossible");
            }
        }
        System.out.println(sum);
    }
}
