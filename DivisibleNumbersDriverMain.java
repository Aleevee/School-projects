import java.util.*;

public class DriverMain {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ProblemSolution problemSolution = new ProblemSolution();
        System.out.print(problemSolution.solution(N));
    }
}
