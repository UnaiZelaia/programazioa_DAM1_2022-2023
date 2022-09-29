public class HarmonicSum {
    public static void main(String[] args) {
        final int ONE = 1;

        int maxNumber = 50000;

        double difference = 0;
        double sumR2L = 0.0;
        double sumL2R = 0.0;

        //Loop Left to Right 1/1, 1/2, 1/3, 1/4...
        for(double i = 1; i <= maxNumber; i++){
            sumR2L = sumR2L + ONE / i;
        }

        //Loop Right to left 1/50000, 1/49999, 1/49998, 1/49997... starts at maxNumber
        for(double i = maxNumber; i >= 1; i--){
            sumL2R = sumL2R + ONE / i;
        }
        System.out.println(sumR2L);
        System.out.println(sumL2R);

        //Calculate absolute difference. 
        //Check which number is bigger and make the operation based on that
        if(sumL2R > sumR2L){
            difference = sumL2R - sumR2L;
        }
        else if(sumR2L > sumL2R){
            difference = sumR2L - sumL2R;
        }
        else{
            System.out.println("The numbers are the same");
        }

        System.out.println("The difference is: " + difference);
    }
}
