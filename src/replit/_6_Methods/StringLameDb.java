package replit._6_Methods;

import java.util.*;

public class StringLameDb {
    public static void main(String[] args) {
        System.out.println(lameDb("1other#2example#3text", "edit", "2", "word"));
    }

    public static String lameDb(String db, String op, String id, String data) {
        List<String> stringList = new ArrayList<>(Arrays.asList(db.split("#")));
        int actionIndex = Integer.parseInt(id);
        switch (op) {
            case "add":
                if (actionIndex > stringList.size()) {
                    stringList.add(actionIndex - 1, id + data);
                } else {
                    int newId = 1;
                    String newDb = "";
                    for (int i = 0; i < stringList.size(); i++) {
                        if (actionIndex - 1 == i) {
                            newDb += newId + data + "#";
                            newId++;
                        }
                        newDb += newId + stringList.get(i).substring(1) + "#";
                        newId++;
                    }
                    return newDb.substring(0, newDb.length() - 1);
                }
                break;
            case "edit":
                stringList.set(actionIndex - 1, id + data);
                break;
            case "delete":
                stringList.remove(actionIndex - 1);
                break;
        }
        String newStr = stringList.toString();
        newStr = newStr.substring(1, newStr.length() - 1).replace(", ", "#");
        return newStr;
    }//end lameDb
}
//        if(op.equals("add")){
//            stringList.add(actionIndex,data);
//        }else if(op.equals("edit")){
//            stringList.set(actionIndex, data);
//        }else if(op.eq)