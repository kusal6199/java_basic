import java.util.*;
public class factorial_function {
    public static void ftral(int n){
        if (n<0) {
            System.out.println("invalid number");
            return;
            
        }
        int fact=1,i;
        
        for(i=1;i<=n;i++){
            fact=fact*i;
            
        }
        System.out.println("the factorila is "+ fact);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find factorial: ");
        int n=sc.nextInt();
        ftral(n);
        sc.close();
    }   
}
