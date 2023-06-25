import java.util.*;
public class _switch {
    public static void main(_String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number from 1-3 only: ");
        int num=sc.nextInt();
        switch(num){
            case 1: System.out.println("sunday");
            break;
            case 2: System.out.println("monday");
            break;
            case 3: System.out.println("tuesday");
            break;
            default:  System.out.println("not valid number");
        }
        
    }
    
}
