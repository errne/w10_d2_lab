import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {

    private RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Technics", "1210");
    }


    @Test
    public void canGetPlayspeed() {
        assertEquals(0, recordDeck.getPlaySpeed());
    }

    @Test
    public void canSetPlayspeed() {
        recordDeck.setPlaySpeed(44);
        assertEquals(44, recordDeck.getPlaySpeed());
    }


}
