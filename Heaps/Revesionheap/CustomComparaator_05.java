package Heaps.Revesionheap;

import java.util.*;

class Student implements Comparable<Student>{
      int rno;
      double perc;
      String name;

      Student(int rno, double perc, String name){
            this.name = name;
            this.rno = rno;
            this.perc = perc;
      } 

      @Override
      public int compareTo(Student other){
            return Double.compare(other.perc, this.perc); // descending
      }
}

public class CustomComparaator_05 {

      public static void print(Student[] arr){
            for (int i = 0; i < arr.length; i++) {
                  if(arr[i] != null)
                        System.out.print(arr[i].name + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {

            Student[] s = new Student[4];

            s[0] = new Student(80, 95,"Sumit");
            s[1] = new Student(82, 90,"Ravi");
            s[2] = new Student(85, 96,"Aadi");
            s[3] = new Student(88, 99,"Toto");

            print(s);

            Arrays.sort(s);

            print(s);
      }
}