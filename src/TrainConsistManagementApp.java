import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== UC2 - Add Passenger Bogies to Train ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies: ");

        System.out.println("Passenger bogies after insertion: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removing ' AC Chair' : ");
        System.out.println("Passenger bogies after removal: " + passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train consist.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        System.out.println("Final train passenger Consist: ");

        System.out.println("Final passenger bogies: " + passengerBogies);
    }
}
