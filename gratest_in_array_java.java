

import java.util.*;
public class gratest_in_array_java {
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
        for(double element: arr){
            if (element>max) {
                max=element;
            }
        }
        System.out.println("the gratest is "+max);

    }
}
