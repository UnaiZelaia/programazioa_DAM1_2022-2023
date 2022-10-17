import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    //Write a program which prompts user for the number of students in a class (a non-negative integer), 
    //and saves it in an int variable called numStudents. It then prompts user for the grade of 
    //each of the students (integer between 0 to 100) and saves them in an int array called grades. 
    //The program shall then compute and print the average (in double rounded to 2 decimal places) 
    //and minimum/maximum (in int).

    public static void main(String[] args) {
        int numStudents;
        float gradesAverage, gradesSum = 0;
        int[] grades;
        boolean isValid = false;
        boolean isValidGrade = false;
        
        Scanner input = new Scanner(System.in);


        //Enter the number of students
        do{
            System.out.print("Enter the size of the array: ");
            numStudents = input.nextInt();

            if(numStudents > 0){
                isValid = true;
            }

        }while(!isValid);

        //Array with size equal to number of students.
        grades = new int[numStudents];

        //Loop to ask for the grades of each student
        for(int i = 0; i < numStudents; i++){
            isValid = false;
            //validate that the grade is between 0 and 100
            do{
                int ikaslea = i + 1;
                System.out.print("Sartu " + ikaslea + " ikaslearen nota: ");
                int tempGrade = input.nextInt();

                if(tempGrade <= 100 && tempGrade >= 0){
                    grades[i] = tempGrade;
                    isValidGrade = true;
                }
                else{
                    i = i-1;
                }
            }
            while(!isValidGrade);
        }
        input.close();


        //Find the average grade.
        for(int i = 0; i < grades.length; i++){
            gradesSum = gradesSum + grades[i];
        }
        gradesAverage = gradesSum / grades.length;

        //And print the average
        System.out.println("The average grade is: " + gradesAverage);

        //Find the max and min
        System.out.println("The best grade is: " + Arrays.stream(grades).max().getAsInt());
        System.out.println("The worst grade is: " + Arrays.stream(grades).min().getAsInt());
    }
}
