class Penn {
    String color="black";
    String type="ball";
    double price=10.2;

    void print_details(){
        System.out.print("Color: "+color+"\n");
        System.out.print("Type: "+type+"\n");
        System.out.print("Price: "+price+"\n");
    }

    void write(){
        System.out.println("write something");
    }
}

public class Pen{

    public static void main(String[] args) {
        Penn pen1 = new Penn();
        pen1.print_details();
        System.out.println();
        pen1.write();
    }
}