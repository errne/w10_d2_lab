import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {
    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("JVC", "AD12");
    }

    @Test
    public void canTune(){
        assertEquals("RadioFour", radio.tune(StationType.RADIOFOURTH));
    }
}
