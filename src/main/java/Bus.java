import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if(passengerCount() < capacity ) passengers.add(person);
    }

    public void popPassenger() {
        passengers.remove(passengerCount()-1);
    }

    public void pickUp(BusStop busStop) {
        for (int i = busStop.queueLength()-1; i>=0; i--){
            if(this.destination.equals(busStop.getDestinationByIndex(i))){
                addPassenger((busStop.getQueue().remove(i)));
            }
        }

    }

}
