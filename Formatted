import java.text.NumberFormat;
import java.util.*;

    public class FutureValueApp {

        public static void main(String[] args) {

            System.out.println ("Welcome to the Future Value Calculator\n");

            Scanner sc = new Scanner(System.in);
            String choice = "y";

            while (choice.equalsIgnoreCase("y")) {
                System.out.println("DATA ENTRY");
                double monthlyInvestment = getDoubleWithinRange(sc, "Enter monthly investment: ", 0, 1000);
                double interestRate = getDoubleWithinRange(sc, "Enter yearly interst rate: ", 0, 30);
                int years = getIntWithinRange(sc, "Enter number of years: ", 0, 100);
                System.out.println();
            

                double monthlyInterestRate = interestRate / 12 / 100;
                int months = years * 12;
                double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

                NumberFormat c = NumberFormat.getCurrencyInstance();
                NumberFormat p = NumberFormat.getPercentInstance();
                p.setMinimumFractionDigits(1);
                
                String results
                        = "Monthly investment: " + c.format(monthlyInvestment) + "\n" + "Yearly interest rate: " + p.format(interestRate / 100) + "\n" + "Future value: " + c.format(futureValue) + "\n";
                
                System.out.println("FORMATTED RESULTS");
                System.out.println(results);
                
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                sc.nextLine();
                System.out.println();
                        

            }

        }
    }
