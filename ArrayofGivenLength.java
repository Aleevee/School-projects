import java.util.*;

public class Solution {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int A[] = new int[N];

        for (int i = 0; i< N; i++) {
          A[i] = s.nextInt();
        }

         for(int i = 0; i < N; i++) {
          System.out.print(A[i] + " ");
         }
  }
}
