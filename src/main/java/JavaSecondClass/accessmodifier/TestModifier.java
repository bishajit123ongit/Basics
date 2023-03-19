package JavaSecondClass.accessmodifier;

public class TestModifier {
    private int dataWithinPackage = 90;
    protected int testProtectedWitninpackage = 10;
    private void hellowWorld(){
        System.out.println("Private within package");
    }
    protected void displayProtected(){
        System.out.println(testProtectedWitninpackage);
    }

}
