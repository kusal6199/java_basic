import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,num;
        System.out.print("enter the number to find tabel: ");
        num=sc.nextInt();
        for(i=1;i<=10;i++){
            // rea=num*i
            System.out.println(num*i);
        }
        
        sc.close();
    }
    
}
