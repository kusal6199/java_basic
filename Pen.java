class Penn {
    String color;
    String type;
    double price;

    void print_details(){
        System.out.print("Color: "+this.color+"\n");
        System.out.print("Type: "+this.type+"\n");
        System.out.print("Price: "+this.price+"\n");
    }

    void write(){
        System.out.println("write something");
    }
}

public class Pen{

    public static void main(String[] args) {
        Penn pen1 = new Penn();
        pen1.color="red";
        pen1.type="ball";
        pen1.price=15.00;
        pen1.print_details();
        System.out.println();
        pen1.write();

        Penn pen2= new Penn();
        pen2.color="black";
        pen2.type="gell";
        pen2.price=20.00;
        pen2.print_details();
        System.out.println();
        pen2.write();

    }
}