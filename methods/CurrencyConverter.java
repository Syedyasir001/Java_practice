package methods;

public class CurrencyConverter {

    // constants
    private static final double USD_TO_INR_RATE = 83.50;
    private static final double EUR_TO_INR_RATE = 90.25;

    // method to convert USD to INR
    public double usdToInr(double amountUsd) {
        return amountUsd * USD_TO_INR_RATE;
    }

    // method to convert EUR to INR
    public double eurToInr(double amountEur) {
        return amountEur * EUR_TO_INR_RATE;
    }

    // main method
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        double dollars = 50; // 50 USD
        double euros = 75;   // 75 EUR

        double inrFromUsd = converter.usdToInr(dollars);
        double inrFromEur = converter.eurToInr(euros);

        System.out.println("--- Currency Conversion Report ---");
        System.out.printf("$%.2f USD is equal to ₹%.2f INR.%n", dollars, inrFromUsd);
        System.out.printf("€%.2f EUR is equal to ₹%.2f INR.%n", euros, inrFromEur);
    }
}
