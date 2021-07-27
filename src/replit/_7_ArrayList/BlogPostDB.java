package replit._7_ArrayList;

import java.util.*;

public class BlogPostDB {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{"1","title","content1"});
        list.add(new String[]{"2","another title","content2"});
        list.add(new String[]{"3","yet another title","content3"});

        String id  = "2";

        System.out.println(blogDb(list, id));
        String a = list.get(0)[0];
        System.out.println(a);
    }
    public static String blogDb(ArrayList<String[]> r, String id) {
        String result = "";
        for (int i = 0; i < r.size(); i ++){
            if(r.get(i)[0].equals(id)){
                result += r.get(i)[1] + "\n"+r.get(i)[2];
                break;
                }
            }
        return result;
    }
}
