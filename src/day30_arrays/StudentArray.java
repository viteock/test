package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"BloodZero", "Mike", "Lashok", "B22", "+22412311"};
        String[] student2 = new String[5];
        student2[0] = "LothLorien";
        student2[1] = "Jora";
        student2[2] = "Patsanu";
        student2[3] = "B00";
        student2[4] = "+001";

        System.out.println("student data length : " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass : data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("Pass: data arrays length match");
        } else {
            System.out.println("Fail: data arrays length missmatch");
        }
    }
}
