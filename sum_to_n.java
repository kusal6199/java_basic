
import java.util.*;
public class sum_to_n {
    public static int sum(int n){
        int sum;
        if (n==0||n==1) {
            return n;
        }
        else{
            return sum=n+sum(n-1);
        }
    }
    public static void main(_String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the number upto which u want sum: ");
        n=sc.nextInt();
        System.out.println("the final sum is "+sum(n));
        
        sc.close();
    }
    
}
