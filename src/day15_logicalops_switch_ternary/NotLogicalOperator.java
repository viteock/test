package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 25;
        //check if age IS NOT more than 7. print "Nee to sit in child car seat . age
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        }else {
            System.out.println("Can sit normal seat. age = " + age);
        }
    }
}
