import java.util.Scanner;

public class TaxWithholdingCalculator {

    public static double calculateWeeklyTaxWithholding(double income) {
        double taxRate;

        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        return income * taxRate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        try {
            double income = scanner.nextDouble();
            double taxWithholding = calculateWeeklyTaxWithholding(income);

            System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithholding);
        } catch (Exception e) {
            System.out.println("Please enter a valid numerical income value.");
        } finally {
            scanner.close();
        }
    }
}