import java.util.*;

public class ProblemSolution {
  public ProblemSolution(int N1, int N2) {
    int sum = N1 + N2;
    System.out.println(sum);
  }
  
  public ProblemSolution(int N1, int N2, intN3) {
    int sum = N1 + N2 + N3;
    System.out.println(sum);
  }
  
  public static void main(String arg[]){
    Scanner scanner = new Scanner(System.in);
    int N1, N2, N3;
    N1=scanner.nextInt();
    N2 = scanner.nextInt();
    N3 = scanner.nextInt();
    ProblemSolution problemSolution = new ProblemSolution(N1,N2);
    ProblemSolution problemSolution1 = new ProblemSolution(N1,N2,N3);
  }
}

                                                        
