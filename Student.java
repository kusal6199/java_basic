class Student_info {
    _String name;
    int age;

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Student{
public static void main(_String[] args) {
    Student_info s1 = new Student_info();
    s1.name="kushal";
    s1.age=21;
    s1.printInfo();
}
}

