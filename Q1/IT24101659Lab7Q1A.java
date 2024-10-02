import java.util.Scanner;
public class IT24101659Lab7Q1A  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        double avg;
        String grade;

        

        System.out.println("Enter marks for four sbjects : ");
        System.out.print("\n");


        
        for(int marks; count <=4 ; count++ ) {
            System.out.print("Enter Subject Mark" +" "+ count + ": ");
            marks = input.nextInt();
            sum += marks;
        }
        System.out.print("\n");

        //Calculate the average
        avg = sum / (count -1);
        System.out.println("Average is : " + avg);
        

        //Grade choose
        grade = (avg >= 75 && avg <= 100) ? "Distinction" :(avg >=50 && avg <= 74) ? "Credit" : "Fail";
        System.out.print("Overall Grade is : " + grade);

















    }
}