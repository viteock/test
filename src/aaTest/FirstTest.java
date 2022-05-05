package aaTest;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstTest {
    public static void main(String[] args) {
        System.out.println("aloha");
        /*
        comments
         */
        /**
         * zz
         */
        //TODO check todo

        // aloaha
        System.out.println("\"\n\t ");
        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        double asd = (a.equalsIgnoreCase("aloha"))? 25.6 : 22.1;
//
//        switch (a){
//            case "asd":
//                break;
//            default:
//                System.out.println("azs");
//        }
        /**
         *
         */
        /*

         */
//
        /**
         * byte>short>int>long
         * float>double
         * boolean
         * char
         */

        /**
         * +,-,*,/,%
         */
        char qwe = (char) 65;
        System.out.println(qwe);

String word = "aloha";
        System.out.println(word.indexOf("ha"));
        System.out.println(word.substring(2, 4));
        System.out.println(word.substring(2));

        int as=0;
        while(as < 2)
            {
                System.out.println("+1");
                as++;

            }
        do{
            System.out.println("+2");
            as+=2;
        }while(as < 8);

        for(int i = 0; i<3;i++){
            System.out.println("i+1");
        }

        for (char each : word.toCharArray()){

            if(each== 'l'){
                continue;
            }
            if(each=='h'){
                break;
            }
            System.out.println("each = " + each);
        }

        String[] names= {"vik","zic","mik"};
        int[] nums = {1,2,3,4,5,6};
        System.out.println(nums.length);


        FirstTest azxc = new FirstTest(2,"big");
        List<FirstTest> er = new ArrayList<>();
        er.add(azxc);

        int fd = Integer.MAX_VALUE;

        FirstTest f1 = new FirstTest();
        f1.overloadingMethod(1);
        f1.overloadingMethod("az");

    }
    public static void callMe() {
        System.out.println("call");
    }
    public int callTimes(int args){
        System.out.println("calling" + args + "times");
        return args-1;
    }
    public FirstTest(){
        System.out.println("constructor");
    }
    public FirstTest(int a, String b){

    }
    private int overloadingMethod (String arg0){
        return 1;
    }
    private void overloadingMethod (int a){
        System.out.println(a);
    }
}
