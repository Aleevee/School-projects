import java.util.*;

abstract class Bank {
    public abstract double calculateSimpleInterest(double amount, int time);
}

class BankA extends Bank {
    public double calculateSimpleInterest(double amount, int time) {
        double rate = 10.0;
        return (amount * rate * time) / 100;
    }
}

class BankB extends Bank {
    public double calculateSimpleInterest(double amount, int time) {
        double rate = 9.0;
        return (amount * rate * time) / 100;
    }
}

class BankC extends Bank {
    public double calculateSimpleInterest(double amount, int time) {
        double rate = 7.0;
        return (amount * rate * time) / 100;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double amount = scanner.nextDouble();
        int time = scanner.nextInt();
        
        Bank bank;
        if (choice == 1) {
            bank = new BankA();
        } else if (choice == 2) {
            bank = new BankB();
        } else {
            bank = new BankC();
        }
        
        double interest = bank.calculateSimpleInterest(amount, time);
        System.out.println(interest);
    }
}
