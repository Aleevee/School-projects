import java.util.*;

  public class Solution {
    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        long longSum = 0;

          for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
            longSum = longSum + A[i];
          }
            System.out.print(longSum);
    }
  }

