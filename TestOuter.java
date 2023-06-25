// import Outer.Inner;

public class TestOuter {
    public static void main(_String[] args) {
        // Inner obj = new Inner();illigal 
        // obj.showX();
        Outer objOuter =new Outer();
        objOuter.diaplayX();
        objOuter.showInner();
        System.out.println(Outer.outer_x);


    }
}
