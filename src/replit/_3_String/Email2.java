package replit._3_String;

public class Email2 {
    public static void main(String[] args) {
        String email = "wasea_krasav4iku@bazar.huinea";

        //copy from
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        System.out.println("First name: " + firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1).toLowerCase());
        System.out.println("Last name: " + lastName.substring(0, 1).toUpperCase()
                + lastName.substring(1).toLowerCase());
        System.out.print("Domain: " + domain);
    }
}
