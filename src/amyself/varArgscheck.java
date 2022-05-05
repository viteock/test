package amyself;

public class varArgscheck {
    public static int check(int... nums){
        int sum = 0;
        for(int each: nums){
            sum += each;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(check(10,10,11,12));
        System.out.println(check(1, 2, 3));
    }

}
