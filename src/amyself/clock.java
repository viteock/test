package amyself;

public class clock {
    public static void main(String[] args) {
        int size = 15;
        for(int i =0; i<size;i++) {
            int spaces = size-i;
            for (int s =0; s<spaces;s++) {
                System.out.print(" ");
            }
            for(int r = 0; r<=i; r++) {
                System.out.print("\uD83D\uDD50");
            }
            System.out.print("\n");
        }
    }
}
