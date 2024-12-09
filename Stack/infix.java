package Stack;

import java.util.*;

public class infix {
      public static void main(String[] args) {
            String str = "8-(5+3)*4/6"; // Expression jo evaluate karna hai
            Stack<Integer> val = new Stack<>(); // Ye stack values ko store karega
            Stack<Character> op = new Stack<>(); // Ye stack operators ko store karega

            for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i); // Har character ko pick karte hain
                  int ascii = (int) ch; // Character ka ASCII value nikalte hain

                  // Agar character ek number hai (0-9):
                  if (ascii >= 48 && ascii <= 57) {
                        val.push(ch - 48); // Character ko integer mein convert karke stack mein daalo
                  }
                  // Agar operator stack khaali hai:
                  else if (op.size() == 0 || ch== '('|| op.peek()=='(') {
                        op.push(ch); // Operator ko stack mein daalo
                  } else {
                        // Agar '+' ya '-' operator mila:
                        if (ch == '+' || ch == '-') {
                              // Pehle higher precedence waale operators ko resolve karo
                              while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*'
                                          || op.peek() == '/')) {
                                    int v2 = val.pop(); // Second value lete hain
                                    int v1 = val.pop(); // First value lete hain
                                    if (op.peek() == '-')
                                          val.push(v1 - v2); // Subtraction
                                    if (op.peek() == '+')
                                          val.push(v1 + v2); // Addition
                                    if (op.peek() == '*')
                                          val.push(v1 * v2); // Multiplication
                                    if (op.peek() == '/')
                                          val.push(v1 / v2); // Division
                                    op.pop(); // Operator hata do
                              }
                              op.push(ch); // Current operator stack mein daalo
                        }
                        // Agar '*' ya '/' operator mila:
                        else if (ch == '*' || ch == '/') {
                              // Pehle higher precedence waale operators ko resolve karo
                              while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                                    int v2 = val.pop(); // Second value
                                    int v1 = val.pop(); // First value
                                    if (op.peek() == '*')
                                          val.push(v1 * v2); // Multiplication
                                    if (op.peek() == '/')
                                          val.push(v1 / v2); // Division
                                    op.pop(); // Operator hata do
                              }
                              op.push(ch); // Current operator stack mein daalo
                        }
                  }
            }

            // Jo bhi operators aur values stack mein bache hain, unhe resolve karte hain
            while (!op.isEmpty()) {
                  int v2 = val.pop(); // Second value
                  int v1 = val.pop(); // First value
                  if (op.peek() == '-')
                        val.push(v1 - v2); // Subtraction
                  if (op.peek() == '+')
                        val.push(v1 + v2); // Addition
                  if (op.peek() == '*')
                        val.push(v1 * v2); // Multiplication
                  if (op.peek() == '/')
                        val.push(v1 / v2); // Division
                  op.pop(); // Operator hata do
            }

            // Final result jo stack mein bacha hai, usse print karte hain
            System.out.println(val.peek());
      }
}
