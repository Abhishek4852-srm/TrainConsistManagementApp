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
        System.out.println("UC9 - Group Bogies by Type (Collectors.groupingBy)");
        System.out.println("===============================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cylindrical", "Goods", 80));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Grouping bogies by type using Collectors.groupingBy()
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("\n" + type + " Bogies:");
            list.forEach(System.out::println);
        });

        System.out.println("\nUC9 grouping completed...");
    }
}
