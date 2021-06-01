package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "0";
        System.out.println(jobTitle.isEmpty());

        if("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("job title is not empty");
        }

        String aloha = (jobTitle.isEmpty()) ? "no aloha" : ( ("".equals(jobTitle)) ? "no aloha" : "aloha hawaii!!");
        System.out.println("aloha = " + aloha);
        System.out.println("java".contains("a"));
    }
}
