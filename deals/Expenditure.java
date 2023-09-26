package deals;

public class Expenditure extends Deal{
    private final String name;
    public Expenditure(String name, int price) {
        super(
                String.format("Покупка %s на %d руб.", name, price),
                0,
                price
        );
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
