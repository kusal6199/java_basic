import java.util.*;
public class bubble_sort {
    public static void main(_String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the arry element: ");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort algorithm

        for(i=0;i<arr.length;i++){
            for(j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;  
                }
            }
        }
        System.out.println("Sorted array");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }


        sc.close();
    }
    
}
