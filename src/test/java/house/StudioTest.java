package house;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudioTest {

    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfBedrooms);
    }

    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
