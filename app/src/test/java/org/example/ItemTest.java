package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testItem() {
        // إنشاء بيانات لاختبارها
        Item item = new Item("Laptop", 1000.00, 3);

        // اختبار القيم
        assertEquals("Laptop", item.getName());
        assertEquals(1000.00, item.getPrice());
        assertEquals(3, item.getQuantity());
    }
}
