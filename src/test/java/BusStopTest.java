import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("String Street");
    }

    @Test
    public void addPerson() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void removePerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueLength());
        busStop.removePerson(0);
        assertEquals(0, busStop.queueLength());
    }
}
