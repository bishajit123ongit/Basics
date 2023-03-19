package JavaSecondClass.testpackage;


import JavaSecondClass.datatype.PrimitiveDataType; //import package

public class TestPackage {
    public static void main(String[] args) {
        PrimitiveDataType pd = new PrimitiveDataType();
        pd.insert(001, "Bishajit",4545, 50000, true);
        pd.display();
    }
}
