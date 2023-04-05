import java.util.*;

   public class Solution {
    public static void main(String[] args) {

      Scanner myObj = new Scanner(System.in);
        int N1, N2, N3;
         N3 = Integer.parseInt(myObj.nextLine());

          for (N1 = 1; N1 <= N3; N1++){
            for (N2 = 1; N2 <= N3; N2++){
              if (N2 == N3) {

                System.out.println("*");

            }

           else{
        
                System.out.print("* ");


          }
        }
      }
    }
  }
