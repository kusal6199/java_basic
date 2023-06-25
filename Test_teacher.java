import java.util.*;
public class Test_teacher {
    public static void main(_String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate;
        Teache t = new Teache();
        t.read_info();
        t.view_teacher();
        System.out.println("enter the rate: ");
        rate=sc.nextDouble();
        // t.increa_salary(rate);
        System.out.println("the final salry = "+t.increa_salary(rate));

    }
}
