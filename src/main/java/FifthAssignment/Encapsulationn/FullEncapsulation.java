package FifthAssignment.Encapsulationn;

public class FullEncapsulation {
    private int docID;
    private String doctorName;
    private String doctorDept;

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDoctorDept(String doctorDept) {
        this.doctorDept = doctorDept;
    }

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
        FullEncapsulation fe = new FullEncapsulation();
        fe.setDocID(12);
        fe.setDoctorName("Ovi");
        fe.setDoctorDept("EYE");
        System.out.println(fe.getDocID());
        System.out.println(fe.getDoctorName());
        System.out.println(fe.getDoctorDept());
    }
}
