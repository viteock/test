package aaTest;

public abstract class Inh {
    public static int a;
    public abstract void abc();
}
class Inh2 extends Inh implements Lop{

    @Override
    public void abc() {
        Inh2.a =1;
    }
    public void za(){

    }
}