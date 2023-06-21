import java.util.*;

interface Interest {
    static final double rate = 25;
    
    double simpleInterest();
    double compInterest();
}

class Bank implements Interest {
    private int principal;
    private float year;
    
    public Bank(int principal, float year) {
        this.principal = principal;
        this.year = year;
    }
    
    public double simpleInterest() {
        return (principal * rate * year) / 100;
    }
    
    public double compInterest() {
        double amount = principal * Math.pow(1 + (rate / 100), year);
        return amount - principal;
    }
}

class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();
        float year = s.nextFloat();
        
        Interest bank = new Bank(principal, year);
        
        System.out.println(bank.simpleInterest());
        System.out.println(bank.compInterest());
    }
}
