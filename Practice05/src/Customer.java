/**
 *
 * @author niconator
 */
public class Customer {
    public int customerID;
    public char status = 'N';
    public double totalPurchases = 0.0;
    
    public void displayCustomerInfo() {
        System.out.println("Customer ID: "+customerID);
        System.out.println("Status: "+status);
        System.out.println("Purchases: "+totalPurchases);
    }
}
