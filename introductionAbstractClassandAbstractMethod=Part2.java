import.java.util.*;

abstract class Car {
  private String model;
  private int maxSpeed;

public Car(String model, int maxSpeed) {
      this.model = model;
      this.maxSpeed = maxSpeed;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class Suzuki extends Car {
    public Suzuki(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        int speed = scanner.nextInt();
        
        Suzuki suzuki = new Suzuki(model, speed);
        
        System.out.println(suzuki.getModel());
        System.out.println(suzuki.getMaxSpeed());
    }
}
