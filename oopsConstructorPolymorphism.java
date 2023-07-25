import java.util.*;
class Pen{
    String type;
    String color;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    // 2 type of polymorphism
    // 1.function overloading (compile time polymorphism)--same name but different parameters like constructor.
    public void printInfo(String name){
        System.out.println(name);
        
    } 
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);

    }



    // 3 type constructor 
    // 1.non parameterized constructor 
    Student(){
        System.out.println("constructor called  ");
    }
    
    // 2.parameterized constructor
    Student( String name, int age){
        this.name = name;
        this.age = age;
    }

    //  3.copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}
public class oopsConstructorPolymorphism {
    public static void main(String[] args){




        Student student1 = new Student("chandra",23);
        Student student2 = new Student(student1);
        student2.printInfo(23);


        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        
        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen1.printColor();
        // pen2.printColor();
    }
    
}
