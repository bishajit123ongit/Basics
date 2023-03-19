package fouthAssignment.inheritance;

public class HierarchyInheritance {
    public static void main(String[] args) {
        TestHierarchy th = new TestHierarchy();
        th.display();
        th.assignEmployee(1, 50000.90);
        th.empDisplay();
        // compile error th.test();
    }
}
