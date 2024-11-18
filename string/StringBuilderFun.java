package string;

import java.util.Scanner;

public class StringBuilderFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        
        // Use the first input string to create StringBuilder
        StringBuilder sb = new StringBuilder(s);
        
        // Modify the StringBuilder and print it
        sb.setCharAt(1, 'a');
        System.out.println("Modified string: " + sb);
    }
}
