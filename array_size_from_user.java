import java.util.*;
public class array_size_from_user {
    public static void main(_String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i;
        System.out.print("enter array size: ");
        n=sc.nextInt();
        int[] marks = new int[n];
        System.out.println("enter marks of different subjects: ");
        for(i=0;i<n;i++)
        marks[i]=sc.nextInt();

        System.out.println("marks of different subjects: ");
        for(i=0;i<n;i++)
        System.out.println(marks[i]);;
        sc.close();
    
    }
}
