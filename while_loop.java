import java.util.*;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.print("enter the last limit: ");
        int num=sc.nextInt();
        
        while(i<=num){
            System.out.println(i);
            i++;

        }
        sc.close();
    }
    
}
