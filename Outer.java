public class Outer {
   static int outer_x=100;
    
    void diaplayX(){
        System.out.println("x= "+outer_x);

    }
    void showInner(){
        Inner innerObj=new Inner();
        innerObj.showX();
    }
    class Inner{
        int y=35; 
        void showX(){
            
            System.out.println("from inner class x= "+outer_x);
            
            
        }
    }
   
}
