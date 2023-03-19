package FifthAssignment.Encapsulationn;

public class ReadEncapsulation {
    private int docID = 123;
    private String doctorName = "Bishajit Sarkar";
    private String doctorDept = "EYE";

    public int getDocID() {
        return docID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorDept() {
        return doctorDept;
    }

    public static void main(String[] args) {
        ReadEncapsulation re = new ReadEncapsulation();
        System.out.println(re.getDocID());
        System.out.println(re.getDoctorName());
        System.out.println(re.getDoctorDept());

    }
}
