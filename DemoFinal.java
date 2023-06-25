public class DemoFinal {
    final double PI;
    DemoFinal(){
        PI=3.14;
        
    }
    void displayPI(final double newvalue ){
        System.out.println("PI="+ PI);
        
        System.out.println("new value ="+ newvalue);
        newValue=750.23;
    }
  
    public static void main(_String[] args) {
        DemoFinal d= new DemoFinal();
        d.displayPI();
    }
}
