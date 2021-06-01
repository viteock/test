package day35_methods_with_param;

import java.sql.SQLOutput;

public class Counters {
    public static void main(String[] args) {
        int num  = 10;
        count(num);

    }
    public static void count(int num) {
        for(int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
