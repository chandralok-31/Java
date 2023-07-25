import java.util.*;

import bank.Bank;
// single level inheritance , multilevel inheritance ,Hierarchical inheritance
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println((l*h)/2);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println((l*h)/2);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }

}
public class oopsInheritance {
    public static void main(String[] args){
        


        // Bank b=new Bank();
        // b.name="chandralok";
        // System.out.println(b.name);
        // Triangle t1=new Triangle();
        // t1.area(2,2);
        // EquilateralTriangle e1=new EquilateralTriangle();
        // e1.area();
        
    }
    
}
