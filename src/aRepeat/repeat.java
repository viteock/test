package aRepeat;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class repeat {
   // public static void main []
   public static void main(String[] args) {
       System.out.println("aloha" + "blea");

       //+ - * / %
       Scanner scan = new Scanner(System.in);
       System.out.println("zii wei ceva");
       String zii = scan.next();

       if(zii.equals("aloha")){
           System.out.println("da nu nahui");
       }else {
           System.out.println("lashara");
       }
       System.out.println((zii.equals("ebati"))? "pizdets" : "ebat kapat");

       switch (zii) {
           case "aloha":
               System.out.println("switch aloha");
               break;
           case"ebati":
               System.out.println("switch ebati");
               break;
       }

       //LOOPS

       while(1>0){
           System.out.println("potter");
           break;
       }
       do{
           System.out.println("check");

       }while(0>1);

       for(int i=0; i< zii.length();i++){
           System.out.println("miau");
       }

       //for each


       String[] abc = {"a","b"};
       String[] atc = new String[4];
       atc[0] = "z";

   }

   void aloha(int i) {
       System.out.println("z");
   }
   int aloha(int i, String b){
       return 1;
   }
}
