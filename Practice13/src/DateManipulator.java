
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author niconator
 */
public class DateManipulator {

    Date myDate = new Date();
    SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyyy");
    
    public void parseDate(String dateString) {
        try {
            String formatDate;
            simpleDF.parse(dateString);
            System.out.println("Parse Successful");
            System.out.println("Date with native form: "+myDate);
            formatDate = simpleDF.format(myDate);
            System.out.println("Formatted date: "+formatDate);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
    }
    
}
