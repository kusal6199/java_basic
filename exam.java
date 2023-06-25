import java.util.*;
public class exam {
    private int roll;
    private String name;
    private double phone;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPhone() {
        return phone;
    }
    public void setPhone(double phone) {
        this.phone = phone;
    }

    public void ChangePhone(double newPhone){
        phone=newPhone;
    }

    public class Test_student {
    

        public static void main(String[] args) {
           
            exam s = new exam();
            s.setName("kushaL");
            s.setRoll(13);
            s.setPhone(98677);
            System.out.println("name "+  s.getName());
            s.getRoll();
            s.getPhone();
    
    
            s.ChangePhone(12334);
            System.out.println(s.getPhone());

    
            
    
    
    
    
    
        }
    
    }
    
    
    
}

   