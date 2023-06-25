import java.util.*;
public class fibnico_recursion {
    public static int fibnico(int n){
        if (n==0||n==1) {
           return n;
        }
        else{
           return fibnico(n-1)+fibnico(n-2);
        }
    }
    public static void main(_String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.print("enter n term of series: ");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print(fibnico(i)+" ");
        }
        

        sc.close();
        
    }
    
}
