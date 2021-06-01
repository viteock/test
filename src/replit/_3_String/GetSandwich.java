package replit._3_String;

public class GetSandwich {
    public static void main(String[] args) {
        String str = "xxbreadchickenbreadyy";

        //copy from
        int idxFirstBread = str.indexOf("bread");
        int idxLastBread = str.lastIndexOf("bread");
        boolean twoBreads = idxFirstBread != idxLastBread;
        if (str.contains("bread") && twoBreads) {
            str = str.substring(idxFirstBread + 5, idxLastBread);
            System.out.println(str);
        } else {
            System.out.print("nothing");
        }

    }
}
