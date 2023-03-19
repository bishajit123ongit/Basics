package JavaThirdAssignment;

public class ConstructorTest {
    int doctorId;
    String doctorName;
    String email;
    String address;
    String dept;

    //no argumets
    public ConstructorTest() {
        System.out.println("This is no argument constructor");
    }

    // with arguments
    public ConstructorTest(int doctorId, String doctorName, String email, String address, String dept) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.email = email;
        this.address = address;
        this.dept = dept;
    }

    void display() {
        System.out.println("ID->" + this.doctorId + " name->" + doctorName + " email->" + email + " address->" + address + " dept->" + dept);
    }

    public static void main(String[] args) {
        ConstructorTest ct2 = new ConstructorTest();
        ConstructorTest ct1 = new ConstructorTest(001, "Ovi", "oviomps@gmail.com", "CTG", "ICU");
        ct1.display();
    }
}
