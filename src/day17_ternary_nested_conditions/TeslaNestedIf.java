package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Plaid";

//        if (model == 'S') {
//            if (trim.equals("Long range")) {
//                System.out.println("Range is 412");
//                System.out.println("Top speed 155");
//                System.out.println("0-");
//                //          }else if(trim.equals())
//            }
        boolean x =true;
                boolean y = !x == false;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int a = 0;
        if (a==0){
            a+=50;
        }
        if (a!=0){
            a+=50;
        }
        System.out.println("a = " + a);

        boolean zz = a++ ==100;
        System.out.println("zz = " + zz);
        
        boolean bz = !true;
        System.out.println("bz = " + bz);
       }

    }