package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if (isHungry) {
//            if (isHungry == true)
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code Java");
        } else {
            System.out.println("I am not hungry, Let's keep coding java");
        }
        double price = 234.21;
        boolean isAffordable = 200 >= price;

        if (isAffordable) {
            System.out.println("Yes, it is affordable");
        }else{
            System.out.println("Go to work and make money");
        }

        boolean isRemoteJob = true;
        //if it not remoteJob print "Sorry I am not interested"
        //otherwise, print "Sure I am interested, what is the interview process?"

//        if(isRemoteJob != true) {
        if(!isRemoteJob){

//            (!isRemoteJob) == (isRemoteJob !=

            System.out.println("Sorry I am not interested");
        }else{
            System.out.println("Sure I am interested, what is the interview process?");
        }
    }
}
