package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void test_sample() {
        Vehicle vehicle = new Vehicle(10);
        assertEquals(10, vehicle.getRemainingFuel());
    }
}
