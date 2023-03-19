package FifthAssignment.Abstractionn;

public abstract class MixAbstraction {


   public MixAbstraction(){
        System.out.println("Mix abstraction started");
    }

    abstract void sum();

    public int subtraction(int a, int b){
        return a-b;
    }
}
