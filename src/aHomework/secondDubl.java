package aHomework;

public class secondDubl {
    public static String secondCharDubl(String str) {

        int toSecond = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                toSecond++; //2
                if (toSecond == 2) {
                    return "" + str.charAt(i);
                }
            }
        }
        return "no dublicates";
    }

    public static void main(String[] args) {
        System.out.println(secondCharDubl("million"));
        System.out.println(returnDublas("million"));
    }


    public static String returnDublas(String str) {
        String dublicates = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                dublicates += "" + str.charAt(i); //miln
            }
        }
//millionnmi
        return "" + dublicates.charAt(1);
    }
}









