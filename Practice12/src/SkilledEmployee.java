
import java.util.ArrayList;

/**
 *
 * @author niconator
 */
public class SkilledEmployee extends Employee {
    
    private ArrayList<String> skillList = new ArrayList<String>();
    
    public void setSkill(String str) {
        skillList.add(str);
    }
    
    public ArrayList getSkill() {
        return skillList;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Employee has the following skills: ");
        
        for(String str : skillList) {
            System.out.println("\t"+str);
        }
    }
}
