import java.util.*;
public class sum_of_n_recursion {
    public static int sumToN(int n){
        if (n==0||n==1) {
            return n; 
        }
        else{
            return n+sumToN(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter a number upto which u want sum: ");
        n=sc.nextInt();
        System.out.println("The sum is "+ sumToN(n));

        sc.close();
    }
    
}
