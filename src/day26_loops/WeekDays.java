package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            switch (a) {
                case 1:
                    System.out.println(a + " - Monday");
                    break;
                case 2:
                    System.out.println(a + " - Tuesday");
                    break;
                case 3:
                    System.out.println(a + " - Wednesday");
                    break;
                case 4:
                    System.out.println(a + " - Thursday");
                    break;
                case 5:
                    System.out.println(a + " - Friday");
                    break;
                case 6:
                    System.out.println(a + " - Saturday");
                    break;
                case 7:
                    System.out.println(a + " - Sunday");
                    break;
                default:
                    System.out.println(a + " - no such day , it's java day");
            }
        }
    }
}
