public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;      // Store the lowerbound
        final int UPPERBOUND = 1000;   // Store the upperbound
        int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                       // Set the initial sum to 0
        // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if(number % 7 == 0){
              // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
                sum = sum + number;  // Accumulate number into sum
                number ++;  
            }else{
                number ++;
            }
        }
        // Print the result
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
     }
}
