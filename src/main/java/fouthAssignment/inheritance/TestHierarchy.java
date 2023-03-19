package fouthAssignment.inheritance;

public class TestHierarchy extends Employee {
    public void display() {
        System.out.println("HELLO WORLD");
    }

    public static void main(String[] args) {
        TestHierarchy th = new TestHierarchy();
        th.display();
    }
}
