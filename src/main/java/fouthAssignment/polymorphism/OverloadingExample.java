package fouthAssignment.polymorphism;

public class OverloadingExample {
    public void calculateMathCalc() {
        System.out.println("Math calculation started");
    }

    public void calculateMathCalc(int number) {
        System.out.println("This method calculate nth summation of number");
        int number1 = ((number * (number - 1)) / 2);
        System.out.println(number1);
    }

    public void calculateMathCalc(int number1, int number2) {
        System.out.println("This method calculate summation of two numbers");
        int result = number1 + number2;
        System.out.println(result);
    }

    public void calculateMathCalc(double number1, double number2) {
        System.out.println("This method calculate average  of two numbers");
        double result = number1 + number2;
        result = result / 2;
        System.out.println(result);
    }

    public void calculateMathCalc(double totalAmount, int totalEmployee) {
        System.out.println("This method calculate average of expense of company for salary");
        System.out.println(totalAmount / totalEmployee);
    }

    public static void main(String[] args) {
        OverloadingExample overloading = new OverloadingExample();
        overloading.calculateMathCalc();
        overloading.calculateMathCalc(5);
        overloading.calculateMathCalc(10, 5);
        overloading.calculateMathCalc(10.00, 11.00);
        overloading.calculateMathCalc(11.5, 2);
    }
}
