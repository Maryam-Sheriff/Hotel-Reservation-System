package Classes;

public class Log_in {

    private String user_n;
    private String pass;
    private int employee_ID;
    private boolean IsAdmin;

    public Log_in(String user_n, String pass, int employee_ID, boolean IsAdmin) {
        this.user_n = user_n;
        this.pass = pass;
        this.employee_ID = employee_ID;
        this.IsAdmin = IsAdmin;
    }

    public String getUser_n() {
        return user_n;
    }

    public void setUser_n(String user_n) {
        this.user_n = user_n;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public boolean isIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    @Override
    public String toString() {
        return "Log_in{" + "user_n=" + user_n + ", pass=" + pass + ", employee_ID=" + employee_ID + ", IsAdmin=" + IsAdmin + '}';
    }
    
   
}
