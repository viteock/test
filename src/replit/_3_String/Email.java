package replit._3_String;

public class Email {
    public static void main(String[] args) {
        String email = "aloha_blea@ibati.kapati";

        //copy from
        if(email.contains("_")) {
          String firstName = email.substring(0, email.indexOf("_"));
          String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
          email = email.replace(firstName, "firstpart").replace(lastName, "secondpart");
          email = email.replace("firstpart", lastName).replace("secondpart", firstName);
        }
        System.out.println(email);
    }
}
