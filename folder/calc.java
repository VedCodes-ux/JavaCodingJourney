package folder;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("WELCOME TO CALCULATOR");
        System.out.print("enter first number:");
        int A = SC.nextInt();
        System.out.print("enter operator:");
        String op = SC.next();
        System.out.print("enter second number:");
        int B = SC.nextInt();

        switch (op) {
            case "+":
                System.out.println(A+B);
                break;
            case "-":
                System.out.println(A-B);
                break;
            case "/":
                System.out.println(A/B);
                break;
            case "*":
                System.out.println(A*B);
                break;
            case "%":
                System.out.println(A%B);
                break;
        
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
