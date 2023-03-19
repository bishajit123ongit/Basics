package fouthAssignment.inheritance;

public class Company {
    int cmpTinNo;
    String cmpName;
    String cmpAddress;
    String cmpDesignation;

    public void companyDetailsAssign(int cmpTinNo, String cmpName, String cmpAddress, String cmpDesignation) {
        this.cmpTinNo = cmpTinNo;
        this.cmpName = cmpName;
        this.cmpAddress = cmpAddress;
        this.cmpDesignation = cmpDesignation;
    }

    public void companyDetailsDetails() {
        System.out.println(" Tin No-> " + cmpTinNo + " Company Name-> " + cmpName + " Address-> " + cmpAddress + " Designation-> " + cmpDesignation);
    }
}
