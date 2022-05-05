package amyself;

public class Method {
    public static void main(String[] args) {
        System.out.println(aloha("aloha, java is fun, ui"));
    }

public static String aloha(String arg0){
    String result = "";
    for(int i=0;i<arg0.length();i++){ // bcabca
        if(result.contains(arg0.charAt(i)+"")){ //a4o1
            continue;
        }
        if( arg0.charAt(i) == 'a' || arg0.charAt(i) == 'A'){
            int count = 0;
            for(int j = i;j<arg0.length();j++){
                if(arg0.charAt(i) == arg0.charAt(j)){
                    count++;
                }
            }
            result+= "a" +count;
        }   else  if( arg0.charAt(i) == 'e' || arg0.charAt(i) == 'E'){
            int count = 0;
            for(int j = i;j<arg0.length();j++){
                if(arg0.charAt(i) == arg0.charAt(j)){
                    count++;
                }
            }
            result+= "e" +count;
        } else  if( arg0.charAt(i) == 'i' || arg0.charAt(i) == 'I'){
            int count = 0;
            for(int j = i;j<arg0.length();j++){
                if(arg0.charAt(i) == arg0.charAt(j)){
                    count++;
                }
            }
            result+= "i" +count;
        }else  if( arg0.charAt(i) == 'o' || arg0.charAt(i) == 'O'){
            int count = 0;
            for(int j = i;j<arg0.length();j++){
                if(arg0.charAt(i) == arg0.charAt(j)){
                    count++;
                }
            }
            result+= "o" +count;
        }else  if( arg0.charAt(i) == 'U' || arg0.charAt(i) == 'u'){
            int count = 0;
            for(int j = i;j<arg0.length();j++){
                if(arg0.charAt(i) == arg0.charAt(j)){
                    count++;
                }
            }
            result+= "u" +count;
        }

    }
    return result;
}



        public static String solution(String S) {
            //Initialize an integer array of size 5, because we need to check 5 common vowels (A,E,I,O,U)
            //The name of the array is count, by default it filled with zeros
            int [] count = new int [5];
            //Traverse each character of S using a for loop
            for (int i = 0; i < S.length(); i++) {
                //Use if condition to check if S has determined vowels
                if (S.charAt(i) == 'a' || S.charAt(i) == 'A') {
                    //Count[0] stores the frequency of ‘a’
                    //If the character is ‘a’, increment count[0]
                    count[0]++;

                }
            else if (S.charAt(i) == 'e' ||  S.charAt(i) == 'E') {
                    //Count[1] stores the frequency of ‘e’
                    //If the character is ‘e’, increment count[1]
                    count[1]++;

                }
            else if (S.charAt(i) == 'i' ||  S.charAt(i) == 'I') {
                    //Count[2] stores the frequency of ‘i’
                    //If the character is ‘i’, increment count[2]
                    count[2]++;

                }
            else if (S.charAt(i) == 'o' || S.charAt(i) == 'O') {
                    //Count[3] stores the frequency of ‘o’
                    //If the character is ‘o’, increment count[3]
                    count[3]++;

                }
            else if (S.charAt(i) == 'u' || S.charAt(i) == 'U') {
                    //Count[4] stores the frequency of ‘u’
                    //If the character is ‘u’, increment count[4]
                    count[4]++;

                }
            }
            //We created return method, which return String
            return "a appears " + count[0] + " time \ne appears " + count[1] +
                    " time \ni appears " + count[2] + " time \no appears " + count[3] +
                    " time \nu appears " + count[4] + " time";


        }


    }
