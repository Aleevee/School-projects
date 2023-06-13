import java.util.*;

public class Library {
  private int acc_num;
  private String title;
  private String author;
  private int lateDays;
  
  public void setValues(int acc_num, String title, String author) {
    this.acc_num = acc_num;
    this.title = title;
    this.author = author;
  }
  
  public void display() {
    System.out.println(acc_num + " " + title + " " + author);
  }
  
  public void compute(int lateDays) {
    int fine = lateDays * 2;
    System.out.println(fine);
  }
  
  public static void main(String[] args) {
    Library book = new Library();
    
    Scanner s = new Scanner(System.in);
    
    int acc_num = s.nextInt();
    s.nextLine();
    
    String title = s.nextLine();
    
    String author = s.nextLine()l
      
      int lateDays = s.nextInt();
    
    book.setValues(acc_num, title, author);
    book.display();
    book.compute(lateDays);
    
    s.close();
    
  }
}
