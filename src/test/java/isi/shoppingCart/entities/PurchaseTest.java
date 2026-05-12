package isi.shoppingCart.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest {
    private static Product product;
    private static Purchase purchase;
    private static Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "Customer");
        product = new Product(1, "Laptop", 1000.0, 10);
        purchase = new Purchase (1, customer);
    }

    @Test
    void getId() {
        assertEquals(1, purchase.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer, purchase.getCustomer());
    }

    @Test
    void getItems() {
        PurchaseItem purchaseItem = new PurchaseItem(product, 3, product.getPrice());
        purchase.addItem(purchaseItem);
        assertEquals(1, purchase.getItems().size());
    }

    @Test
    void addItem() {
        PurchaseItem purchaseItem = new PurchaseItem(product, 3, product.getPrice());
        purchase.addItem(purchaseItem);
        assertEquals(product, purchaseItem.getProduct());
        assertEquals(3, purchaseItem.getQuantity());
    }

    @Test
    void getTotal() {
        PurchaseItem purchaseItem = new PurchaseItem(product, 3, product.getPrice());
        purchase.addItem(purchaseItem);
        assertEquals(3000.0, purchase.getTotal());
    }
}
