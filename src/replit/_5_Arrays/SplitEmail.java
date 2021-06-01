package replit._5_Arrays;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "vrpirgari@gmail.com";

        //copy from
        String[] emailSeparated = email.split("@");
        if (emailSeparated.length == 2) {
            System.out.println("Email id: " + emailSeparated[0]);
            System.out.print("Email domain: " + emailSeparated[1]);
        } else {
            System.out.print("invalid email");
        }
    }
}
