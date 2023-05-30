import java.util.*;
public class Calculate_area {
    double olength;
    double ilength;
    double obreadth;
    double ibreadth;
    double oarea;
    double iarea;
    Scanner sc = new Scanner(System.in);

    void read_measurement(){
        System.out.println("enter inner lenght: ");
        ilength= sc.nextDouble();
        if (ilength<0) {
            System.out.println("enter positive");
            System.exit(0);
        }
        System.out.println("enter inner breadth: ");
        ibreadth= sc.nextDouble();
        if (ibreadth<0) {
            System.out.println("enter positive");
            System.exit(0);
        }
        System.out.println("enter outer lenght: ");
        olength= sc.nextDouble();
        if (olength<0) {
            System.out.println("enter positive");
            System.exit(0);
        }
        System.out.println("enter outer breadth: ");
        obreadth= sc.nextDouble();
        if (obreadth<0) {
            System.out.println("enter positive");
            System.exit(0);
        }
    }
    // double calculate_inner(){
    //     double iarea=ilength*olength;
    //     return iarea;
    // }

    // double claculate_outer(){
    //     double oarea=olength*olength;
    //     return oarea;
    // }
    double claculate_middle(){
        if (ilength>olength) {
            System.out.println("inner length cant be bigger");
            System.exit(0);
        }
        if (ibreadth>obreadth) {
            System.out.println("inner breadth cant be bigger");
            System.exit(0);
        }
        double marea;
        marea=(olength*obreadth)-(ilength*ibreadth);
        return marea;
    }

}
