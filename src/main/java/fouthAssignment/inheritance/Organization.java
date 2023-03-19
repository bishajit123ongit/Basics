package fouthAssignment.inheritance;


//Multilevel inheritance
public class Organization extends Employee{
    String orgName;
    String location;

    public void test(){
        System.out.println("Hello world");
    }
    public void orgAssign(String orgName,String location){
        this.orgName = orgName;
        this.location = location;
    }
    public void orgDisplay(){
        System.out.println("Org name-> "+orgName+" location-> "+location);
    }

    public static void main(String[] args) {
        Organization org = new Organization();
        org.orgAssign("MISL Group","Kawran Bazar");
        org.orgDisplay();
        org.assignEmployee(1,200000.90);
        org.empDisplay();
        org.companyDetailsAssign(1212,"MISL","Kawran Bazar","SOFTWARE");
        org.companyDetailsDetails();
    }

}
