/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    void testAddItems() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    void testRemoveItem() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testClearCart() {
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void testRemoveNonExistentItem() {
        cart.addItem("Apple");
        assertDoesNotThrow(() -> cart.removeItem("Banana"));
        assertEquals(1, cart.getItemCount());
    }
}