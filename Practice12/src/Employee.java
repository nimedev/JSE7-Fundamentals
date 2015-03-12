/**
 *
 * @author niconator
 */
public class Employee implements Printable {
    private String name;
    private String jobTitle;
    private int employeeID;
    private int level;
    protected static int employeeIDCounter=0;
    
    public void calculateEmployeeID() {
        employeeIDCounter++;
        setEmployeeID(employeeIDCounter);
    }
    
    public void print() {
        System.out.println("Name: "+getName());
        System.out.println("Job: "+getJobTitle());
        System.out.println("ID: "+getEmployeeID());
        System.out.println("Levle: "+getLevel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    private void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
}
