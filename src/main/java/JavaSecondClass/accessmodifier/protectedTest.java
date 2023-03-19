package JavaSecondClass.accessmodifier;

import JavaSecondClass.TestModifier.Test;

public class protectedTest extends Test {
    public static void main(String[] args){
        protectedTest pt = new protectedTest();
        TestModifier t = new TestModifier();
        t.displayProtected();
        pt.display();

    }


}
