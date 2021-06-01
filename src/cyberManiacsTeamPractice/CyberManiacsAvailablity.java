package cyberManiacsTeamPractice;
import java.util.Scanner;
public class CyberManiacsAvailablity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student's first name to get individual's availability or " +
                "type All to get everyone's availability!");
        System.out.println("Student's name will be same as shown in discord!");
        String name = scan.nextLine();

        if(name.equalsIgnoreCase("Bekir")){
            System.out.println("Bekir is available mornings 7:30-9:00am" +
                    " and 9-10 pm on week nights." +
                    " Lastly Saturday 9pm-10pm , Sunday 7pm-9-pm central time");
        }else if(name.equalsIgnoreCase("Irem")){
            System.out.println("Irem is available on Wednesday and Thursday from 2pm - 4pm central time!");
        }else if(name.equalsIgnoreCase("Liudmyla")){
            System.out.println("This student has not given weekly availability, yet.");
        }else if(name.equalsIgnoreCase("Sarah")){
            System.out.println("Sarah is available from 5pm-6pm central time," +
                    " and anytime before or after class on weekends.");
        }else if(name.equalsIgnoreCase("Victor")){
            System.out.println("Victor is available, just send message before hand!");
        }else if(name.equalsIgnoreCase("Anastasiya")){
            System.out.println("This student has not given weekly availability, yet.");
        }else if(name.equalsIgnoreCase("Suhrob")){
            System.out.println("This student has not given weekly availability, yet.");
        }else if(name.equalsIgnoreCase("Anca")){
            System.out.println("Anca is available mornings between 7am to 8:30am central time " +
                    "and 45 mins either before or after class");
        }else if(name.equalsIgnoreCase("Halyna")){
            System.out.println("Halyna is available weekdays 30 mins before class");
        }else if(name.equalsIgnoreCase("Khrystyna")){
            System.out.println("Khrystyna is available mornings after 8:30am till 10:30am central time," +
                    " and an hour before/after class");
        }else if(name.equalsIgnoreCase("Perizat")){
            System.out.println("This student has not given weekly availability, yet.");
        }else if(name.equalsIgnoreCase("Edward")){
            System.out.println("Edward is available...");
        }else if(name.equalsIgnoreCase("All")){
            System.out.println("Edward: is available...");
            System.out.println("Victor: is available, just send message for confirmation.");
            System.out.println("Bekir: is available mornings 7:30-9:00am" +
                    " and 9-10 pm on week nights." +
                    " Lastly Saturday 9pm-10pm , Sunday 7pm-9-pm central time");
            System.out.println("Sarah: is available from 5pm-6pm central time," +
                    " and anytime before or after class on weekends.");
            System.out.println("Anca: is available mornings between 7am to 8:30am central time " +
                    "and 45 mins either before or after class");
            System.out.println("Khrystyna: is available mornings after 8:30am till 10:30am," +
                    " and an hour before/after class");
            System.out.println("Irem: is available on Wednesday and Thursday from 2pm - 4pm central time.");
        }else{
            System.out.println("Invalid Entry! This is possibly not a student in CyberManiacs.");
        }
    }

}