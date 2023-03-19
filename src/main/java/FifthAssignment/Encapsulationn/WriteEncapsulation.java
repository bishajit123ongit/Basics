package FifthAssignment.Encapsulationn;

public class WriteEncapsulation {
    private int docID;
    private String doctorName;
    private String doctorDept;

    public void setDocID(int docID) {
        this.docID = docID;
        System.out.println(docID);
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
        System.out.println(doctorName);
    }

    public void setDoctorDept(String doctorDept) {
        this.doctorDept = doctorDept;
        System.out.println(doctorDept);
    }

    public static void main(String[] args) {
        WriteEncapsulation we = new WriteEncapsulation();
        we.setDocID(12);
        we.setDoctorName("Ovi");
        we.setDoctorDept("EYE");
    }
}
