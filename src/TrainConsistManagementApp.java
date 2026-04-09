import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private String type;
    private int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") -> " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC10 - Count Total Seats in Train (reduce)");
        System.out.println("===============================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cylindrical", "Goods", 80));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Stream pipeline: map + reduce
        int totalSeats = bogies.stream()
                .filter(b -> b.getType().equals("Passenger")) // consider only passenger bogies
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Passenger Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}
