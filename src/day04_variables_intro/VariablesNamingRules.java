package day04_variables_intro;

public class VariablesNamingRules {
    public static void main(String[] args){
        //int static =22; ->error, static is reserved by java
        int static1 = 22;
        int _static = 22;
        int $tatic = 33;
        int staticVar = 44;
        // int 1stmontsalary = 100;-> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($); // work fine
        System.out.println(_); //not recommended
        //should use meaningful names
        System.out.println("number-of-friends");
    }

}
