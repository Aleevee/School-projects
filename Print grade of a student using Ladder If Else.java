import java.util.*;
import java.util.Scanner;

  public class Solution {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      double grade = scan.nextDouble();

        if (grade >= 90){
          System.out.println("A");
        }else if (grade < 90 && grade >= 60){
          System.out.println("B");
        }else if (grade < 60 && grade >= 30){
          System.out.println("C");
        }else if (grade < 30){
          System.out.println("D");


       }
    }
}
