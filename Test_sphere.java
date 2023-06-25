import java.util.*;
public class Test_sphere {
    public static void main(_String[] args) {
        Sphere abc =new Sphere();
        abc.read_radius();
        System.out.println("the volume is "+ abc.claculate_volume());
        System.out.println("the TSA is "+ abc.calculateTSA());

    }
}
