import java.util.*;
public class do_while_loop {
    public static void main(_String args[]){
     Scanner kushal=new Scanner(System.in);
     int i=0;
     int num;
     System.out.print("enter the limit number: ");
     num=kushal.nextInt();
     do{
        System.out.println(i);
        i++;
     } while(i<=num);

     kushal.close();
    }
}
