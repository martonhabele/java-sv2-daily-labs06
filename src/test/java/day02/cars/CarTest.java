package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Volvo", 2.4, Color.BLUE, 250);

    @Test
    void createCarTest() {

        assertEquals("Volvo", car.getBrand());
        assertEquals(2.4, car.getEngineSize());
        assertEquals(Color.BLUE, car.getColor());
        assertEquals(250, car.getPrice());
    }

    @Test
    void decreasePriceTest() {
        car.decreasePrice(10);
        assertEquals(225, car.getPrice());
        assertNotEquals(250, car.getPrice());
    }
}