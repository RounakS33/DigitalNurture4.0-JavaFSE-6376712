package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAddition() {
        int sum = 2 + 3;
        assertEquals(5, sum);
        System.out.println("The sum of 2 + 3 is: " + sum);
    }
}