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
    }

    @Test
    void getName() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void getAvailableQuantity() {
    }

    @Test
    void changePrice() {
    }

    @Test
    void increaseAvailableQuantity() {
    }

    @Test
    void decreaseAvailableQuantity() {
    }
}