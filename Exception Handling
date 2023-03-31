import java.text.NumberFormat;
import java.util.*;

    public class FutureValueApp {
        public static void main(String[] args) {

            System.out.println("Welcome to the Future Value Calculator\n");
            Scanner sc = new Scanner(System.in);
            String choice = "y";

            while (choice.equalsIgnoreCase("y")) {
                double monthlyInvestment;
                double interestRate;
                int years;

                try {
                    System.out.print("Enter monthly investment: ");
                    monthlyInvestment = sc.nextDouble();
                    System.out.print("Enter yearly interest rate: ");
                    interestRate = sc.nextDouble();
                    System.out.print("Enter number of years: ");
                    years = sc.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error! Invalid number. Try again.\n");
                    sc.nextLine();
                    continue;
                }

                double monthlyInterestRate = interestRate / 12 / 100;
                int months = years * 12;
                double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

                NumberFormat currency = NumberFormat.getCurrencyInstance();
                System.out.println("Future value: " + currency.format(futureValue) + "\n");

                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }

        private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {

            double futureValue = 0;
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
            }
            return futureValue;
        }
    }
