package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        // byte -> short -> long -> float -> double

        byte b = 10;
        short s = b;
        byte b2 = (byte) s;

        double d = 5.3;
        int i = (short) d;
        int i2 = (int) d;

        System.out.println(i);
        System.out.println((double)i);

        float f = 3.54f;
        float f2 = (float) 3.54; // float = (float)double

        float f3 = 5; // float = int ->
        float f4 = 5.5F; //float = double

        long l = 22342; // long = int
        long l2 = 432432523532523532L;
        // long l3 = (long)2343534534543; -> this does not work because number is too big

        System.out.println(l);
        System.out.println((double) l);
        System.out.println((float)l);

        double million = 1_000_000;
        System.out.println("million = " + million);

    }
}
