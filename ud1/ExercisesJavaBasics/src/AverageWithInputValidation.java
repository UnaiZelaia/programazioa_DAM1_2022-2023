import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        //Write a program that prompts user for the mark (between 0-100 in int) of 3 students; 
        //computes the average (in double); and prints the result rounded to 2 decimal places. 
        //Your program needs to perform input validation.
        boolean isValid = false;
        double sum = 0;
        int numStudents = 3;

        Scanner input = new Scanner(System.in);
        

        for(int i = 1; i <= numStudents; i++){
            do{
                System.out.print("Input mark of student " + i + ": ");
                double mark = input.nextDouble();

                if(mark >= 0 && mark <= 100){
                    sum = sum + mark;
                    isValid = true;
                }
                else{
                    System.out.println("Error. The mark is not valid.");
                }
            }while(!isValid);

            isValid = false;
        }
        input.close();
        double average = sum / numStudents;
        System.out.println("The average mark of the class is: " + String.format("%.2f", average));
    }
}
