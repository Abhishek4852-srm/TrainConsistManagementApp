import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return shape + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("===============================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("\nGoods Bogies in Train:");
        goodsBogies.forEach(System.out::println);

        // Safety rule: Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !(b.getShape().equalsIgnoreCase("Cylindrical") &&
                        !b.getCargo().equalsIgnoreCase("Petroleum")));

        System.out.println("\nTrain Safety Compliance: " + isSafe);
        System.out.println("\nUC12 validation completed...");
    }
}
