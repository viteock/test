package day14_multi_branch_if_statements;

public class  LogicalANDOperator {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        int apples =10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough");
        }else {
            System.out.println("I need to buy some more fruit");
        }

    }
}
