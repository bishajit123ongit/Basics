package JavaSecondClass.datatype;

public class PrimitiveDataType {
    int id;
    String name;
    long phnNumber;
    double salary;
    boolean isPermanent;

   public void insert(int id, String name, long phnNumber, double salary, boolean isPermanent) {
        this.id = id;
        this.name = name;
        this.phnNumber = phnNumber;
        this.salary = salary;
        this.isPermanent = isPermanent;
    }

    public void display() {
        System.out.println("id->" + id + " name->" + name + " number->" + phnNumber + " salary->" + salary + " isPermanent->" + isPermanent);
    }

}
