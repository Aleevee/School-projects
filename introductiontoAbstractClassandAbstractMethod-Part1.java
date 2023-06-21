import java.util.*;

abstract class Shape {
  public abstract void printArea(int side);
}

class Square extends Shape {
  public void printArea(int side) {
    int area = side * side;
    System.out.println(area);
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    Square square = new Square();
    square.printArea(N);

  }
}
