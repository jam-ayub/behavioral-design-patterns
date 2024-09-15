import general.TaxCalculator;
import general.TaxCalculator2019;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculatTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}