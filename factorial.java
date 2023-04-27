import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,fact=1,n;
        System.out.print("enter number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial is: "+fact);
        sc.close();
    }
    
}
