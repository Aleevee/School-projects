import java.util.*;

class Car {
private String color;
private String model;
  
public void setColor(String color) {
    this.color = color;
}

public void setModel(String model) {
    this.model = model;
}

public String getColor() {
    return color;
}

public String getModel() {
    return model;
}
}

class BMW extends Car {
private int alloyWheels;
  
  public void setAlloyWheels(int alloyWheels) {
    this.alloyWheels = alloyWheels;
}

public int getAlloyWheelCount() {
    return alloyWheels;
}
}

class Honda extends Car {
private int normalWheels;
  
  public void setNormalWheels(int normalWheels) {
    this.normalWheels = normalWheels;
}

public int getNormalWheelCount() {
    return normalWheels;
}
}

public class Solution {
static void display(Car car, int wheels) {
System.out.println(car.getModel() + " " + car.getColor() + " " + wheels);
}
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String line;
    String model;
    String color;
    int wheels;

    line = in.nextLine();
    String[] tokens = line.split(" ");

    model = tokens[0];
    color = tokens[1];
    wheels = Integer.parseInt(tokens[2]);
    BMW bmw = new BMW();
    bmw.setModel(model);
    bmw.setColor(color);
    bmw.setAlloyWheels(wheels);

    line = in.nextLine();
    tokens = line.split(" ");

    model = tokens[0];
    color = tokens[1];
    wheels = Integer.parseInt(tokens[2]);
    Honda honda = new Honda();
    honda.setModel(model);
    honda.setColor(color);
    honda.setNormalWheels(wheels);

    display(bmw, bmw.getAlloyWheelCount());
    display(honda, honda.getNormalWheelCount());
}
}
