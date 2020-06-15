import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takesDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void takesTwoDrinks(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void bottleIsEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void bottleIsFilled(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
