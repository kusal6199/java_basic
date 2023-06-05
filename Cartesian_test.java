public class Cartesian_test {
    public static void main(String[] args) {
        Cartesian c = new Cartesian();
        c.getCoordinate();
        System.out.println("distance: "+c.calculate_distance());
        System.out.println("angle:" + c.calculate_angle());
         c.convert_to_polar();


    }

}
