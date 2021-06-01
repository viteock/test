package replit._1_Variables;
import java.util.Scanner;
public class SchoolGrader {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //Subjet 1
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectNumber1 = scan.nextLine();
        double scoreSubjectNumber1 = scan.nextDouble();
        //subject 2
        System.out.println("Please enter subject name number 2 and score for this subject");
        scan.nextLine();
        String subjectNumber2 = scan.nextLine();
        double scoreSubjectNumber2 = scan.nextDouble();
        //subject 3
        System.out.println("Please enter subject name number 3 and score for this subject");
        scan.nextLine();
        String subjectNumber3 = scan.nextLine();
        double scoreSubjectNumber3 = scan.nextDouble();
        //subject 4
        System.out.println("Please enter subject name number 4 and score for this subject");
        scan.nextLine();
        String subjectNumber4 = scan.nextLine();
        double scoreSubjectNumber4 = scan.nextDouble();
        //subject 5
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectNumber5 = scan.nextLine();
        double scoreSubjectNumber5 = scan.nextDouble();
        //build summary
        String summary = subjectNumber1 + " - " + scoreSubjectNumber1 + ", " +
                subjectNumber2 + " - " + scoreSubjectNumber2 + ", " +
                subjectNumber3 + " - " + scoreSubjectNumber3 + ", " +
                subjectNumber4 + " - " + scoreSubjectNumber4 + ", " +
                subjectNumber5 + " - " + scoreSubjectNumber5;
        double averageScore = (scoreSubjectNumber1 + scoreSubjectNumber2 +
                scoreSubjectNumber3 + scoreSubjectNumber4 +
                scoreSubjectNumber5) / 5;
        //printing
        System.out.println("Summary: " + summary);
        System.out.println("Your average score is: " + averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
