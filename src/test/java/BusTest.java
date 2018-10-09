import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;

    @Before
    public void beforeEach(){
        bus = new Bus("Balerno", 5);
    }

    @Test
    public void passengerCount(){
        assertEquals(0, bus.passengerCount() );
    }
    @Test
    public void addPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount() );
    }

    @Test
    public void willNotAddPassengerIfBusFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount() );
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount() );
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount() );
        bus.popPassenger();
        assertEquals(0, bus.passengerCount() );
    }
}
