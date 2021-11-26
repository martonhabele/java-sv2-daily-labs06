package day05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("Stapler", Types.OFFICE, 0.5));
        store.addProduct(new Product("Pen", Types.OFFICE, 0.25));
    }

    @Test
    void testNumberOfProductsByType() {
        List<ProductByVolume> list = store.numberOfProductsByType();
        assertEquals(1, list.size());
        assertEquals(Types.OFFICE, list.get(0).getType());
        assertEquals(2, list.get(0).getCount());
    }
}