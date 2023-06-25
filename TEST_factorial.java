import java.util.*;
public class TEST_factorial {
    public static void main(_String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number");
        n= sc.nextInt();

        Factorial_class fc = new Factorial_class();
        // fc.get_num();
        System.out.println("factorial= "+fc.calculate_factorial(n));

       
    }
}
