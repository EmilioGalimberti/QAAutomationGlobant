package entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testCalculateDiscountWithValidDiscountPercentage() {
        DiscountCalculator calculator = new DiscountCalculator(10);
        assertEquals(90.0, calculator.calculateDiscount(100), 0.001);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscount() {
        DiscountCalculator calculator = new DiscountCalculator(0);
        assertEquals(100.0, calculator.calculateDiscount(100), 0.001);
    }

    @Test
    public void testCalculateDiscountWithMaxDiscount() {
        DiscountCalculator calculator = new DiscountCalculator(100);
        assertEquals(0.0, calculator.calculateDiscount(100), 0.001);
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountPercentage() {
        assertThrows(IllegalArgumentException.class, () -> new DiscountCalculator(-10));
    }

    @Test
    public void testCalculateDiscountWithInvalidDiscountPercentage() {
        assertThrows(IllegalArgumentException.class, () -> new DiscountCalculator(110));
    }
}