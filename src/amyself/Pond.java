package amyself;

import java.util.ArrayList;

public class Pond {
   String size;
   ArrayList<Pillow> pillows = new ArrayList<>();
   public Pond(String size, int numOfPillows) {
       this.size =size;
       for(int i=0;i<numOfPillows;i++){
           this.pillows.add(new Pillow());
       }
   }
}
class Pillow{
    String material;

    public static void main(String[] args) {
        Pond pond = new Pond("king", 4);
        System.out.println(pond.pillows.size());
    }
}