import java.util.Scanner;
public class Test_points {
    public static void main(String[] args) {
        Points p1 =new Points();
        Points p2= new Points();

        p1.read_coordinate();
        p2.read_coordinate();
        
        System.out.println("the ditance berween two points is "+ p2.calculate_distance(p1, p2));
    }
}
