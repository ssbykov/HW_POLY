package taxes;

public class UsnIncomeReducedExpenses extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {

        if (debit > credit){
            return (debit - credit)  * 15 / 100;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "УСН - 15 %";
    }
}
