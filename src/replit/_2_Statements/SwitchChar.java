package replit._2_Statements;

public class SwitchChar {
    public static void main(String[] args) {
        char response = 'y';

        //copy from
        switch (response) {
            case 'y':
                System.out.print("Your request is being processed is printed");
                break;
            case 'n':
                System.out.print("Thank you anyway for your consideration is printed");
                break;
            case 'h':
                System.out.print("Sorry, no help is currently available is printed");
                break;
            default:
                System.out.print("Invalid entry, please try again!");
        }
    }
}
