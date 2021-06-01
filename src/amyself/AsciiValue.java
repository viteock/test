package amyself;

public class AsciiValue {
    public static void main(String[] args) {
        //This will print all Ascii values
        for (int i = 0; i <= 255; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }

        // this loop will print only the values A-Z (uppercase)
        for (int i = 65; i <= 90; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);


        }

        // this will print out the values of a-z lower case
        for (int i = 97; i <= 122; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }



    }
}
