interface Animal{
    public void walk();
}

interface Herbivore{

}


class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}





public class interface1 {
    public static void main(String[] args){
        Horse h1=new Horse();
        h1.walk();
        // Animal a1=new Animal();  //Animal is abstract; cannot be instantiated
        // a1.walk();
        // h1.eat();
    }
    
}
