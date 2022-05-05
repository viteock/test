package amyself;

import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();
        String pass = "";
        for(int i = 0; i < 6; i++){
      pass += (char)random.nextInt(122);
        }
        System.out.println(pass);


        String a = new String(new char[]{'a','b','c'});
        System.out.println(a);
    }
}
