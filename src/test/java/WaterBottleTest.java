import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    int volume = 100;

    @Before
    public void before(){
        waterBottle = new WaterBottle(volume);
    }

    @Test
    public void hasVolume(){
        assertEqual(100, waterBottle.getVolume);
    }



}
