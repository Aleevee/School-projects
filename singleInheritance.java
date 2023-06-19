import java.util.*;

class Base {
  public int addition(int N1, int N2) {
  int z = N1 + N2;
  return z;
 }
  public int subtraction(int N1, int N2) {
  int z = N1 - N2;
  return z;
 }
}

class ProblemSolution extends Base {
  public long solution(int N1, int N2) {
    long result_addition = addition(N1, N2);
    long result_subtraction = subtraction(N1, N2);
    return result_addition * result_subtraction;
  }
}

class DriverMain {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N1 = s.nextInt();
    int N2 = s.nextInt();
    ProblemSolution problemSolution = new ProblemSolution();
    System.out.print(problemSolution.solution(N1, N2));
  }
}
