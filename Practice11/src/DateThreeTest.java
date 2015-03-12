/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DateThreeTest {

  public static void main(String args[]){
    DateThree date = new DateThree();
    date.setDay(7);
    date.setMonth(11);
    date.setYear(2014);
    System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
    
    // Challeng Practice:
    date.setDate(7, 11, 2014);
    date.displayDate();
    
    date.setDate(7, 14, 2014);
    date.displayDate();
    
    date.setDate(35, 11, 2014);
    date.displayDate();
    
    date.setDate(7, 11, 200);
    date.displayDate();
  } // end main
} // end class
