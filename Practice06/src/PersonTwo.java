/**
 *
 * @author niconator
 */
public class PersonTwo {
    StringBuilder name = new StringBuilder(8);
    StringBuilder phone = new StringBuilder();
    
    public void displayPersonInfo() {
        name.append("niconator");
        name.append(" mejia");
        System.out.println(name.toString());
        System.out.println(name.capacity());
        
        phone.append("123456789012");
        phone.insert(3,"-");
        phone.insert(7,"-");
        System.out.println(phone.toString());
        System.out.println(name.substring(0, 9));
    }
}
