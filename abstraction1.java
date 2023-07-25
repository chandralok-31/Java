abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("creating Animal constructor");
    }
    public void eat(){
        System.out.println("animal eats");
    }

}

class Horse extends Animal{
    Horse(){
        System.out.println("creating Horse constructor");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Checken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}



public class abstraction1 {
    public static void main(String[] args){
        Horse h1=new Horse();
        // h1.walk();
        // Animal a1=new Animal();  //Animal is abstract; cannot be instantiated
        // a1.walk();
        // h1.eat();
    }
    
}
