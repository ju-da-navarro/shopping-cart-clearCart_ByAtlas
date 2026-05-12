package isi.shoppingCart.entities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartItemTest {

    @Test
    void CartItem(){
        Product product = new Product(1,"Salmon",5000,5);
        CartItem cartItem = new CartItem(product,1);
        assertEquals(product,cartItem.getProduct());
        assertEquals(1,cartItem.getQuantity());
    }

    @Test
    void getProduct() {
        Product product = new Product(1,"Salmon",5000,5);
        CartItem cartItem = new CartItem(product,1);
        assertEquals(product,cartItem.getProduct());
    }

    @Test
    void getQuantity(){
        Product product = new Product(1,"Salmon",5000,5);
        CartItem cartItem = new CartItem(product,1);
        assertEquals(1,cartItem.getQuantity());
    }

    @Test
    void increaseQuantity(){
        Product product = new Product(1,"Salmon",5000,5);
        CartItem cartItem = new CartItem(product,1);
        cartItem.increaseQuantity();
        assertEquals(2, cartItem.getQuantity());
    }

    @Test
    void getSubtotal(){
        Product product = new Product(1,"Salmon",5000,5);
        CartItem cartItem = new CartItem(product,2);
        assertEquals(10000, cartItem.getSubtotal());
    }

}
