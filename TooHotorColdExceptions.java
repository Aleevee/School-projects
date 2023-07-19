import java.util.*;

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class Customer {
    public int giveCupOfCoffee(int temperature) throws TooColdException, TooHotException {
        if (temperature < 35) {
            throw new TooColdException("Too Cold");
        } else if (temperature > 60) {
            throw new TooHotException("Too Hot");
        }
        return 1;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Customer customer = new Customer();
        int temperature = s.nextInt();

        try {
            int result = customer.giveCupOfCoffee(temperature);
            System.out.println("Coffee is at a perfect temperature.");
        } catch (TooColdException e) {
            System.out.println("Too Cold");
        } catch (TooHotException e) {
            System.out.println("Too Hot");
        }
    }
}
