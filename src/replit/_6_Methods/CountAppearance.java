package replit._6_Methods;

public class CountAppearance {
    public static void main(String[] args) {
        String[] strs = {"qw", "qw", "as", "as", "zxc", "qw", "fg"};
        String word = "qw";
        System.out.println(countAppearance(strs, word));

    }

    public static int countAppearance(String[] arr, String t) {
      return  (t.equals(arr[0])) ? 1 : 2;
//        int count = 0;
//        for (String each : arr) {
//            if (each.equals(t))
//                count++;
//        }
//        return count;
    }
}
