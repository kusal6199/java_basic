import java.util.*;
public class loop_print {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,num;
        System.out.print("enter the limit to print: ");
        num=sc.nextInt();
        for(i=0;i<=num;i++)
        System.out.println(i);

        sc.close();
    }
    
}
