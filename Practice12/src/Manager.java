
import java.util.ArrayList;

/**
 *
 * @author niconator
 */
public class Manager extends Employee {
    private ArrayList employeeList = new ArrayList();
    
    public void setEmployee(Employee emp) {
        employeeList.add(emp);
    }
    
    public ArrayList getEmployees() {
        return employeeList;
    }
    
    @Override
    public void print() {
        Employee emp;
        super.print();
        System.out.println("The manager has the following employees: ");
        
        for(Object obj : employeeList) {
            emp = (Employee)obj;
            System.out.println("\t"+emp.getName());
        }
    }
}
