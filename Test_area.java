public class Test_area {
    public static void main(String[] args) {
        Calculate_area a =new Calculate_area();
        a.read_measurement();
        // a.calculate_inner();
        // a.claculate_outer();
        a.claculate_middle();
        System.out.println("middle area =" +a.claculate_middle());
    }
}
