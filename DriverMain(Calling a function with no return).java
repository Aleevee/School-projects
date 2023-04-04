import java.util.*;

  public class DriverMain {
    public static void main(String[] args) {

      Scanner s = new Scanner(System.in);
      long N1 = s.nextLong();
      long N2 = s.nextLong();

      ProblemSolution problemSolution = new ProblemSolution();
      System.out.print(problemSolution.solution(N1, N2));

  }
}
