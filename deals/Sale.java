package deals;

public class Sale extends Deal {
    private final String name;
    public Sale(String name, int price) {
        super(
                String.format("Продажа %s на %d руб.", name, price),
                price,
                0
        );
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
