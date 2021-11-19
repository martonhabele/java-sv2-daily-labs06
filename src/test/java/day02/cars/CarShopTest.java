package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    CarShop carShop = new CarShop("TripleAAutos", 100);

    @BeforeEach
    void init() {
        carShop.addCar(new Car("Hyundai", 1.4, Color.GREY, 100));
        carShop.addCar(new Car("KIA", 2.2, Color.BLACK, 101));
    }

    @Test
    void createCarShopTest() {

        assertEquals("TripleAAutos", carShop.getName());
        assertEquals(100, carShop.getLimitPriceMax());
        assertEquals(1, carShop.getCarsForSell().size());
    }

    @Test
    void addCarWithPrices() {
        assertEquals(1, carShop.getCarsForSell().size());
        assertEquals("Hyundai", carShop.getCarsForSell().get(0).getBrand());
    }
}