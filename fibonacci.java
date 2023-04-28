import java.util.*;
public class fibonacci {
    public static void series(int n){
        int i;
        int n1=0,n2=1,n3;
        for(i=2;i<=n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("enter no of terms");
        n=sc.nextInt();
        System.out.print("0");
        series(n);
        sc.close();
    }  
}
