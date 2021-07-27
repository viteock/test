package replit._6_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetDuplicates {
    public static int getDup(String[] r) {
        List<String> rArray = new ArrayList<>(Arrays.asList(r));
        int count = 0;
        for (int i = 0; i < rArray.size(); i++) {
            int tempCount = 0;
            for (int j = i; j < rArray.size(); j++) {
                if (rArray.get(i).equals(rArray.get(j))) {
                    tempCount++;
                    if(i != j) {
                        rArray.remove(j);
                        j--;
                    }
                }
            }
            if (tempCount > 1) {
                count += tempCount;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] r = {"1","2","1","aa","b","aa","1","z","aa"};
        System.out.println(getDup(r));
    }
    }
    /*
      public static int getDup(String[] r) {
    int count = 0;
    for(int  i = 0; i < r.length; i++){
      int tempCount = 0;
      for(int j = i; j < r.length; j++){
        if(r[i].isEmpty()){
          break;
        }
        if(r[i].equals(r[j])){
          tempCount++;
          r[j] = "";
        }
      }
      if(tempCount > 1){
        count += tempCount;
      }
    }
  return count;
     */
