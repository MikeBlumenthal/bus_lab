import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    Person person2;
    Person person3;
    BusStop busStop;

    @Before
    public void beforeEach(){
        bus = new Bus("Balerno", 5);
        person = new Person("Balerno");
        person2 = new Person("Bonnyrigg");
        person3 = new Person("Balerno");
        busStop = new BusStop("String Street");
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

    @Test
    public void pickUpPerson(){
        busStop.addPerson(person);
        busStop.addPerson(person2);
        busStop.addPerson(person3);
        assertEquals(3, busStop.queueLength());
        bus.pickUp(busStop);
        assertEquals(1, busStop.queueLength());
        assertEquals(2, bus.passengerCount());
    }
}
