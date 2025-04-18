package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testCustomerName() {
        Customer customer = new Customer("John Doe", true);
        assertEquals("John Doe", customer.getName(), "The customer name should be 'John Doe'");
    }

    @Test
    public void testIsMember() {
        Customer customer = new Customer("Jane Doe", false);
        assertFalse(customer.isMember(), "The customer should not be a member");
    }
}
