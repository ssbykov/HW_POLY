package deals;

public class Expenditure extends Deal{
    public Expenditure(String name, int price) {
        super(
                String.format("Покупка %s на %d руб.", name, price),
                0,
                price
        );
    }
}
