import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queueLength() {
        return queue.size();
    }

    public void addPerson(Person person) {
        queue.add(person);
    }

    public Person removePerson(int index) {
        return queue.remove(index);
    }

    public ArrayList<Person> getQueue() {
        return queue;
    }

    public String getDestinationByIndex(int i) {
        return queue.get(i).getDestination();
    }

    public Person getPersonByIndex(int i) {
        return queue.get(i);
    }
}
