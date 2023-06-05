import java.util.*;
class finalKeywordDemo {
    Scanner sc = new Scanner(System.in);
    final int rate=100;
    int unit;
    void get_unit(){
        System.out.println("enter unit: ");
        unit=sc.nextInt();
        // this.unit=unit;
    }
    int calculate_cost(){
        return unit*rate;
    }

    public static void main(String[] args) {
        finalKeywordDemo obj = new finalKeywordDemo();
        obj.get_unit();
        System.out.println("the total cost is "+ obj.calculate_cost());

    }
}

