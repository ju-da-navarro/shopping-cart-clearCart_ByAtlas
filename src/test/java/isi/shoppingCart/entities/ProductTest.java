package isi.shoppingCart.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product(1, "Laptop", 1000.0, 10);
    }

    @Test
    void getId() {
        assertEquals(1, product.getId());
    }

    @Test
    void getName() {
        assertEquals("Laptop", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(1000.0, product.getPrice(), 0.01);
    }

    @Test
    void getAvailableQuantity() {
        assertEquals(10, product.getAvailableQuantity());
    }

    @Test
    void changePrice() {
        product.changePrice(1500.0);
        assertEquals(1500.0, product.getPrice());
    }

    @Test
    void increaseAvailableQuantity() {
        product.increaseAvailableQuantity(5);
        assertEquals(15, product.getAvailableQuantity());
    }

    @Test
    void decreaseAvailableQuantity() {
        product.decreaseAvailableQuantity(5);
        assertEquals(5, product.getAvailableQuantity());
    }
}
