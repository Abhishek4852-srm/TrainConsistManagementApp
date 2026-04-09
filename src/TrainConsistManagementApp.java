import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===============================================");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("\nBefore Sorting:");
        bogies.forEach(System.out::println);

        // Sorting using Comparator.comparingInt()
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}
