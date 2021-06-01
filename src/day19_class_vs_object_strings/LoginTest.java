package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek",
                expPassword = "Abc123",
                userName = "Cybertek",
                password = "Abc123";

        // userName is not case sensitive
        //password is case sensitive

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass- user successfully logged in");
        }else {
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Incorrect Username");
            }else {
                System.out.println("Incorrect password");
            }
        }

    }
}
