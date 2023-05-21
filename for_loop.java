import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i;
        System.out.print("Enter no. of elements you want in array:");
       int n = sc.nextInt();
       

        double arr[]=new double[n];
        System.out.println("enter array element :");
        for( i =0;i<n;i++){
           
            arr[i]=sc.nextDouble();
        }

        double max=arr[0];
        for(i=0;i<n;i++){
            if (arr[i]>arr[0]) {
                max=arr[i];
            }
        }
        System.out.println("the gratest is "+max);

    }
}
