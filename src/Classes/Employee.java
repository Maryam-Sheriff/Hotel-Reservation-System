package Classes;

public class Employee {

   private int employee_ID;
   private String employee_fN;
   private String employee_lN;
   private String employee_department;
     
   
    public Employee(int employee_ID,String employee_fN,String employee_lN,String employee_department){
        this.employee_ID = employee_ID;
        this.employee_fN = employee_fN;
        this.employee_lN = employee_lN;
        this.employee_department = employee_department;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_fN() {
        return employee_fN;
    }

    public void setEmployee_fN(String employee_fN) {
        this.employee_fN = employee_fN;
    }

    public String getEmployee_lN() {
        return employee_lN;
    }

    public void setEmployee_lN(String employee_lN) {
        this.employee_lN = employee_lN;
    }

    public String getEmployee_department() {
        return employee_department;
    }

    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }


    @Override
    public String toString() {
        return "Employeee{" + "employee_ID=" + employee_ID + ", employee_fN=" + employee_fN + ", employee_lN=" + employee_lN + ", employee_department=" + employee_department + '}';
    }
    
}
