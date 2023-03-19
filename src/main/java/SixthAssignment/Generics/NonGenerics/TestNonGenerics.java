package SixthAssignment.Generics.NonGenerics;


public class TestNonGenerics {
    public static void main(String[] args) {
        IntegerClass integerClass = new IntegerClass();
        StringClass stringClass = new StringClass();
        DoubleClass doubleClass = new DoubleClass();
        integerClass.setNumber(10);
        System.out.println(integerClass.getNumber());
        stringClass.setName("Ovi");
        System.out.println(stringClass.getName());
        doubleClass.setNumber(1000.90);
        System.out.println(doubleClass.getNumber());
    }
}
