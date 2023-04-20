import java.util.*;

public class Array2D {
  public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    int [][] arrayElements = new int[rows][columns];
    
    for(int i = 0; i < rows; i++){
     for(int j = 0; j < columns; j++) {
        arrayElements[i][j] = s.nextInt();

     }
    }
    for(int i = 0; i < rows; i++){
      for(int j = 0; j <= columns - 1; j++)
        if(j == columns - 1){
          System.out.print(arrayElements[i][j] + "");
          System.out.print("\n");
        }
        else {
          System.out.print(arrayElements{i][j] + " ");
        }
      }
    }
  }
