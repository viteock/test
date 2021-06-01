package replit._6_Methods;

public class TimeConversion {
    public static void main(String[] args) {
        timeConversion("12:55:00PM");
    }

    public static void timeConversion(String s) {
        if (s.endsWith("AM")) {
            s = s.replace("AM", "");
            if (s.startsWith("12")) {
                s = s.replace("12", "00");
            }
        } else if (s.endsWith("PM")) {
            s = s.replace("PM", "");
            if (!s.startsWith("12")) {
                int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
                hour += 12;
                s = hour + s.substring(s.indexOf(":"));
            }
        }
        System.out.println(s);
    }
}
