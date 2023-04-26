import java.util.*;
public class button {
    public static void main(String args[]){
        Scanner kushal = new Scanner(System.in);
        System.out.print("enter number (1,2 or 3 only): ");
        int buton = kushal.nextInt();
        if (buton==1)
            System.out.println("Hello");
        else if(buton==2)
        System.out.println("Namaste");
        else if(buton==3)
        System.out.println("Bonjour");
        else 
        System.out.println("not vaild number");

    }
    
}
