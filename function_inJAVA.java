import java.util.*;
public class function_inJAVA {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static void main(_String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.print("enter first number: ");
        a=sc.nextInt();
        System.out.print("enter second number: ");
        b=sc.nextInt();
        int c=calculateSum(a,b);
        System.out.print("the sum is: "+c);
        // System.out.print(c);

        sc.close();

    }
}
