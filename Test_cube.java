import java.util.*;
public class Test_cube {
    public static void main(_String[] args) {
        double measurement;
        double rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cube length: ");
        measurement=sc.nextDouble();
        Cube c1= new Cube();
        c1.setLength(measurement);

        // System.out.println("enter leneth" + c1.setLength());
        System.out.println("the length is "+ c1.getLength());
        System.out.println("the volume is : "+ c1.calcullate_volume());

        System.out.println("enter rate");
        rate=sc.nextDouble();

        System.out.println("cost is "+ c1.cost(rate));
        sc.close();
    }
}
