package replit._6_Methods;

public class SimpleRoomBook {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
        boolean available = false;
        if(isAvailable && year == 2018){
            if(!(month == 7 && day > 8)){
                available = true;
            }
        }
        return available;


    }

    public static void main(String[] args) {

        System.out.println(simpleRoomBook(true, 7, 2, 2018));

    }
}

