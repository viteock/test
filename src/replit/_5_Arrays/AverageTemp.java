package replit._5_Arrays;

public class AverageTemp {
    public static void main(String[] args) {
        double[] temps = {25, 42, 45, 45, 34, 23, 65, 34};

        //copy from
        double total = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }
        double averageValue = total / temps.length;
        System.out.print(averageValue);
    }
}
