package fouthAssignment.polymorphism;

public class OverridingExample extends RootOfPolymorphism {

    @Override
    public void calculateMathCalc(int number1, int number2) {
        System.out.println("This method calculate subtraction of two numbers");
        int result = number1 - number2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        OverridingExample or = new OverridingExample();
        or.calculateMathCalc(20, 6);
    }
}
