package SixthAssignment.Generics.Generics;

public class TestGenerics {
    public static void main(String[] args) {
        Generics<Integer> testInt = new Generics<>(344);
        System.out.println(testInt.getObj());

        Generics<String> testStr = new Generics<>("Bishajit");
        System.out.println(testStr.getObj());
    }
}
