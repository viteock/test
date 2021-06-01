package replit._2_Statements;

public class Grade {
    public static void main(String[] args) {
        int grade = 1;
        //copy from
        if (grade >= 90) {
            System.out.print("excellent");
        } else if (90 > grade && grade >= 70) {
            System.out.print("good");
        } else if (grade >= 60 && grade < 70) {
            System.out.print("pass");
        } else if (grade < 60) {
            System.out.print("fail");
        }
    }
}
