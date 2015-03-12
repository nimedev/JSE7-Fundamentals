/**
 *
 * @author niconator
 */
public class Order {
    long orderValue = 0L;
    int itemQuantity = 10_000_000;
    int itemPrice = 555_500;
    
    public void calculateTotal() {
        // Sin perdida:
        orderValue = (long)itemQuantity * (long)itemPrice;
        System.out.println("Order Total: "+orderValue);
        // Con perdida:
        orderValue = itemQuantity * itemPrice;
        System.out.println("Order Total: "+orderValue);
    }
}
