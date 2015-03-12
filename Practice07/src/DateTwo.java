/**
 *
 * @author niconator
 */
public class DateTwo {
    public int dayNumber = 6;
    
    public void displayDay() {
        if (dayNumber >= 1 && dayNumber <=7) {
            System.out.println(dayNumber);
        } else {
            System.out.println("Error");
        }
    }
}
