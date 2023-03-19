package FifthAssignment.Abstractionn;

 public class TestMixAbstraction extends MixAbstraction{

     private int a = 10,b=19;
     @Override
     void sum() {
         System.out.println(a+b);
     }

     public static void main(String[] args) {
         MixAbstraction ma = new TestMixAbstraction();
         System.out.println(ma.subtraction(10,5));
         ma.sum();
     }
 }
