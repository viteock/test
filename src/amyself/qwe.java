package amyself;

public class qwe {
    static int a = 1;

    static {
        System.out.println(10);
        a = 2;
    }

    public static void main(String[] args) {
        qwe a1 = new qwe();
        qwe.a = 3;
        qwe a2 = new qwe();
        System.out.println(a1.a == a2.a);
    }
}
