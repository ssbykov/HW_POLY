import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.TaxSystem;
import taxes.UsnIncome;
import taxes.UsnIncomeReducedExpenses;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Рога и копыта", new UsnIncome());
        company1.shiftMoney(100);
        company1.shiftMoney(50);
        System.out.println(company1.getTaxSystem());
        company1.payTaxes();

        company1.setTaxSystem(new UsnIncomeReducedExpenses());
        company1.shiftMoney(100);
        company1.shiftMoney(100);
        company1.shiftMoney(-50);
        System.out.println(company1.getTaxSystem());
        company1.payTaxes();

        Deal[] deals = {
                new Sale("Товар1", 200),
                new Sale("Товар2", 100),
                new Expenditure("Трата1", 50),
        };
        System.out.println(company1.applyDeals(deals));
        company1.setTaxSystem(new UsnIncome());
        System.out.println(company1.applyDeals(deals));


    }
}