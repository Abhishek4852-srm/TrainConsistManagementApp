import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("===============================================");

        // Prepare dataset
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Economy", 65));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Loop-based filtering
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        // Stream-based filtering
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        // Display results
        System.out.println("\nLoop-based Filtered Bogies:");
        loopFiltered.forEach(System.out::println);

        System.out.println("\nStream-based Filtered Bogies:");
        streamFiltered.forEach(System.out::println);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Loop-based:   " + loopDuration);
        System.out.println("Stream-based: " + streamDuration);

        System.out.println("\nUC13 performance comparison completed...");
    }
}
