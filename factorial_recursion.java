import java.util.*;
public class factorial_recursion {
    public static int factorial(int n){
        if (n==0||n==1) {
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(_String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter a number for factorial: ");
        n=sc.nextInt();
        System.out.println("The factorial of "+n+" is "+ factorial(n));

        sc.close();
    }
    
}
