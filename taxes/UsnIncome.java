package taxes;

public class UsnIncome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }

    @Override
    public String toString() {
        return "УСН - 6 %";
    }
}
