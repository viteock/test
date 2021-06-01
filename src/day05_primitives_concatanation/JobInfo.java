package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Sommelier ";
        String company = "Wine of France";
        String jobDescription = "Drinking wine";
        double salary = 234231.41;
        byte yearsOfExperience = 25;
        Boolean hasBenefits = true;
        //printing all info
        System.out.println("Job:\t\t\t" + title + "\nCompany:\t\t" + company + "\nJob Descption:\t"+
                jobDescription + "\nSalary deserved:\t$" + salary + "\nYears of experience:\t"+
                yearsOfExperience + "\nDoeas this job has benefits?:\t" + hasBenefits);
    }
}
