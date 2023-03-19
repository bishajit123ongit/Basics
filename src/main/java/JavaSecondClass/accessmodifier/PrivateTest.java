package JavaSecondClass.accessmodifier;

import JavaSecondClass.TestModifier.Test;

public class PrivateTest extends Test {
    private int privateWithinClass = 40;

    public static void main(String[] args) {

        Test t = new Test();
        PrivateTest p = new PrivateTest();
        // t.printHlwWorld();
        System.out.println(p.privateWithinClass);
    }
}
