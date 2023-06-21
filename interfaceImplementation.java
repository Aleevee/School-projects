import java.util.*;

interface Car {
    void displaySpeed();
    void increaseSpeed(int speed);
}

class Suzuki implements Car {
    private int currentSpeed;
    
    public Suzuki(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    public void displaySpeed() {
        System.out.println(currentSpeed);
    }
    
    public void increaseSpeed(int speed) {
        currentSpeed += speed;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentSpeed = scanner.nextInt();
        int speed = scanner.nextInt();
        
        Car suzuki = new Suzuki(currentSpeed);
        suzuki.increaseSpeed(speed);
        suzuki.displaySpeed();
    }
}

