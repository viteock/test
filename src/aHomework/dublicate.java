package aHomework;

public class dublicate {
    public static String findDublicate(String arg){
        String dubl = "";

        for(int i = 0 ; i<arg.length();i++){
            int count = 0;
            for(int j = i; j<arg.length();j++){
                if(arg.charAt(i) == arg.charAt(j)){
                    count++;
                }
            }
          if(!dubl.contains("" +arg.charAt(i))){
              dubl +="" + arg.charAt(i) + count;
          }

        }
        return dubl;
    }

    public static void main(String[] args) {
        System.out.println(findDublicate("alohal"));

    }
}

