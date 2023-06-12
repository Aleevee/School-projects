import java.util.*;

public class Student {
  String a;
  String b;
    public Student() {
      a = "Object created successfully";
      b = "display function called successfully";
      
  }
  
  public static void main(String[] args) {
    Student myObj = new Student();
    Student myObj2 = new Student();
    System.out.println(myObj.a);
    System.out.println(myObj2.b);
    
  }
}
  
