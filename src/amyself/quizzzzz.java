package amyself;

import java.util.*;

public class quizzzzz {
    public static void main(String[] args) {
//  String a = "today it will be 100 degrees !";
//  boolean b = a.contains("i");boolean c = a.substring(12).startsWith("go");
//
//  String result =b && c ? "go" : "dont";
//        System.out.println(result);
//
//
//
//        String word = "";
//        for(int i = a.length()-1;i<=0;i--){
//            word +=a.charAt(i);
//        }
//        System.out.println(word);
//
//        int n = 0;
//        while (n++ < a.length()) {
//            if(n==8) {
//                continue;
//            }else if (n == 9) {
//                break;
//            }
//            System.out.print(a.charAt(++n));
//        }
//        int total = 0, num1 =2, num2 =6;
//        for(int j = 0; j < 5; j++) {
//            if(j%3==0) continue;
//            total += num1+num2;
//        }
//        System.out.println(total);
        int count = 0;
        for (int a = 0;a<4;a++) {
            if(a==3) continue;
            for (int b =a+1;b <5; b++) {
                count++;
                if(b==3)break;
            }
        }
        System.out.println(count + "count");

        boolean[] bool = {true, false, true};
        System.out.println(Arrays.toString(bool));
        char chars[] =new char[26];

        int z =3;
        int[]nums = new int [5];
        nums[0] = nums[1] *z;
        System.out.println(nums[0]);
        byte[]b={1,2,3};
        b[0] = (byte) (b[0]*2);
        System.out.println(b[0]);
        String zz = "aaa";
        String bb= zz +zz.length();
        System.out.println(bb);

        boolean[]bbbb = new boolean[2];
        System.out.println(Arrays.toString(bbbb));

    }
}
