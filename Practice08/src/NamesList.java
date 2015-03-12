
import java.util.ArrayList;

/**
 *
 * @author niconator
 */
public class NamesList {
    
    public ArrayList theList;
    
    public void setList(){
        theList = new ArrayList();
        theList.add("nico mejia");
        theList.add("cubo ma");
        theList.add("nelson fds");
        theList.add("ñeca gda");
        System.out.println(theList);
        System.out.println(theList.size());
    }
    
    public void manipulateList(){
        theList.remove("nico mejia");
        System.out.println(theList);
        System.out.println(theList.size());
        theList.add(2, "nime");
        System.out.println(theList);
        System.out.println(theList.size());
    }
}
