package OOPS;

public class studentclass {
     
      // creating a new  data type
      public static class Student{
            String name;
            int rno;
            double percent;
      } 

      public static void main(String[] args) {
           
            Student x =  new Student();
            x.name = "Navneet";
            x.rno =45; 
            Student s = new Student();
            s.name = "rutu";
            s.percent=97.2;
            s.rno=88;
      }
}
