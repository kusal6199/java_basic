import java.util.*;
public class Static_Use {
    int id;
    _String name;
    double salary;
    static int Company_code;

    Scanner sc = new Scanner(System.in);

    Static_Use() {
        Company_code= 8767;
    }

    void read_data(){
        System.out.println("enter name: ");
        name=sc.nextLine();
        System.out.println("enter id: ");
        id=sc.nextInt();
        System.out.println("enter salary: ");
        salary=sc.nextDouble();
        System.out.println("enter company code: ");
        Company_code= sc.nextInt();
    }
    void display_data(){
        System.out.print("\nName: "+ name);
        System.out.print("\nID: "+ id);
        System.out.print("\nsalary: "+ salary);
        System.out.print("\nCompany Code: "+ Company_code);
    }
}
