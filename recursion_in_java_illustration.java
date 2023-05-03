import java.util.*;
public class recursion_in_java_illustration {
    public static void recursion(int n) {
        if (n==0) {
            return;
        }

        System.out.println(n);
        recursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to print upto zero: ");
        int n=sc.nextInt();
        recursion(n);
        
        sc.close();
        
    }
    
}
