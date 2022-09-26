public class SumAverageRunningInt {
    public static void main(String[] args) {
        //Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. 
        //Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily. 
        //Also compute and display the average

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        double average;
        int sum = 0;

        for(int number = LOWERBOUND;number <= UPPERBOUND;number++){
            sum = sum + number;
        }

        double sumDouble = sum;
        double upperboundDouble = UPPERBOUND;

        average = sumDouble / upperboundDouble;

        System.out.println("The sum of " + LOWERBOUND + " and " + UPPERBOUND + " is: " + sum);
        System.out.println("The average is " + average);
    }
}
