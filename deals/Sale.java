package deals;

public class Sale extends Deal {
    public Sale(String name, int price) {
        super(
                String.format("Продажа %s на %d руб.", name, price),
                price,
                0
        );
    }

}
