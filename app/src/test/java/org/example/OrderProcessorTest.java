package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class OrderProcessorTest {

    @Test
    public void testPrintOrderSummary() {
        Customer customer = new Customer("Ali", true);
        Item item1 = new Item("Pen", 1.0, 3);
        Item item2 = new Item("Notebook", 5.0, 2);

        Order order = new Order(customer, Arrays.asList(item1, item2));
        OrderProcessor processor = new OrderProcessor();

        processor.printOrderSummary(order);
        // لا يوجد تحقق آلي لأن الدالة تطبع فقط، يمكن تعديلها لاحقًا
    }
}
