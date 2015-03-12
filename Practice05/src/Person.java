/**
 *
 * @author niconator
 */
public class Person {
    int years = 1;
    int days;
    long minutes;
    long seconds;
    long milli;
    
    public void calculateAge () {
        days = years * 365;
        seconds = days * 24 * 60 * 60;
        minutes = seconds / 60;
        milli = seconds * 1000;
        System.out.println("Days: "+days);
        System.out.println("Seconds: "+seconds);
        System.out.println("Minutes: "+minutes);
        System.out.println("Milliseconds: "+milli);
    }
}
