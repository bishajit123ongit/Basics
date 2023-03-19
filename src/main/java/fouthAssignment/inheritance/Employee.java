package fouthAssignment.inheritance;

//Single inheritance
public class Employee extends Company {
    int empId;
    double salary;

    public void assignEmployee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public void empDisplay() {
        System.out.println("Emp id-> " + empId + " salary-> " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.assignEmployee(1, 100000.90);
        emp.empDisplay();
        emp.companyDetailsAssign(212, "MISL", "Kawran Bazar", "Software");
        emp.companyDetailsDetails();

    }
}
