package day28_loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for(int i = 1; i <= 8; i++) {
//            System.out.println(random.nextInt(source.length()));
            int index = random.nextInt(source.length());
            System.out.print(source.charAt(index));;
        }
        System.out.println();
        for(int i = 1; i <= 8; i++) {
//            System.out.println(random.nextInt(source.length()));
            int index = random.nextInt(source.length());
            password += source.charAt(index);
        }
        System.out.println(password);
    }
}
