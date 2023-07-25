import java.util.*;
public class conditional {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);


        // int age=sc.nextInt();
        // if (age==18){
        //     System.out.println("you are eighteen years old");
        // }
        // else if (age<18){
        //     System.out.println("you are child");
        // }
        // else{
        //     System.out.println("you are old person");
        // }



        // int x=sc.nextInt();
        // if (x%2==0){
        //     System.out.println("even");

        // }
        // else{
        //     System.out.println("odd ");
        // }



        // int button=sc.nextInt();
        // if (button==1){
        //     System.out.println("hello");
        // }
        // else if (button==2){
        //     System.out.println("namaste");
        // }
        // else if (button==3){
        //     System.out.println("Bonjour");
        // }
        // else
        //     System.out.println("invalid");




        // int button=sc.nextInt();
        // switch(button){
        // case 1:System.out.println("hello");
        // break;
        
        // case 2: System.out.println("namaste");
        // break;
        
        // case 3:System.out.println("Bonjour");
        // break;
        // default :System.out.println("invalid");
        // }



        // ----------------------------------calculator-------------------------------------------------
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.add\n2.substract\n3.multiply\n4.divide");
        while (true) {
        System.out.println("choose any operation");
        int operation_no=sc.nextInt();
        switch(operation_no)
        {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            default: System.out.println("invalid");
            
        }
        }

        
    }
    
}
