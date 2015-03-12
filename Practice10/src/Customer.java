/**
 *
 * @author niconator
 */
public class Customer {
    public int customerID;
    public String name = "-name required-";
    public String address = "-address required-";
    public String phoneNumber = "-phone required-";
    public String eMail = "-email required-";
    
    public void setCustomerInfo(int Id, String nm, String adr, String phNum){
        customerID = Id;
        name = nm;
        address = adr;
        phoneNumber = phNum;
    }
    
    public void setCustomerInfo(int Id, String nm, String adr, String phNum, String email){
        customerID = Id;
        name = nm;
        address = adr;
        phoneNumber = phNum;
        eMail = email;
    }
    
    public void display(){
        System.out.println(customerID);
        System.out.println(name);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(eMail);
    }
}
