package isi.shoppingCart.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        product1 = new Product(1, "Laptop", 1000.0, 5);
        product2 = new Product(2, "Mouse", 50.0, 3);
    }

    @Test
    //El carrito nuevo debería estar vacío
    void CarritoNuevoClean() {
        assertTrue(cart.getItems().isEmpty());
        assertEquals(0, cart.getQuantityByProductId(1));
    }

    @Test
    //Agregar un producto nuevo debería crear un nuevo CartItem
    void AñadirProductoNuevo() {
        cart.addProduct(product1);
        assertEquals(1, cart.getItems().size());
        assertEquals(1, cart.getQuantityByProductId(1));
    }

    @Test
    //Agregar el mismo producto dos veces debería aumentar la cantidad
    void AñadirProductoDuplucaCantidad() {
        cart.addProduct(product1);
        cart.addProduct(product1);

        assertEquals(1, cart.getItems().size());
        assertEquals(2, cart.getQuantityByProductId(1));
    }

    @Test
    void GetTotal() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product2);

        assertEquals(1100.0, cart.getTotal(), 0.001);
    }

    @Test
    void ClearCart() {
        cart.addProduct(product1);
        cart.clearCart();

        assertTrue(cart.getItems().isEmpty());
        assertEquals(0.0, cart.getTotal());
    }
}