import java.util.*;
public class comparision_2_number {
    public static void main(_String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("both are equal");
        }
        else if(a>b){
            System.out.print(a);
            System.out.print(" is grater");
        }
        else {
            System.out.print(b);
            System.out.print(" is grater");
        }
    }
}
