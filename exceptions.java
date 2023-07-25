import java.util.Scanner;

public class exceptions {
    static void avg(){
        try{
            throw new ArithmeticException("Demo");
        }
        catch(ArithmeticException e){
            System.out.println("exception caught: ");
        }
    }


    static void avg1() throws ArithmeticException{
        System.out.println("inside avg function ");
        throw new ArithmeticException("Demo");
    }


    static void validateInput(int number) throws InvalidInputException{
        if(number >100){
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid input number ");
    }


 public static void main(String[] args){

    // -----------------------------BUILT-IN EXCEPTIONS --------------------------------

    // String s=null;
    // try{
    //     System.out.println(s.length());
    // }
    // catch(Exception e){
    //     System.out.println("NullPointerException");
    // }

    // try{
    //     int a=30;
    //     int b=0;
    //     int c=a/b;
    //     System.out.println("result ="+c);
    // }
    // catch(ArithmeticException e){
    //     System.out.println("ArithmeticException");
    // }


    // try{
    //     int num=Integer.parseInt("chandralok");
    //     System.out.println(num);
    // }
    // catch(NumberFormatException e){
    //     System.out.println("NumberFormatException");
    // }

    // try{
    //     int arr[]=new int[5];
    //     arr[7]=9;
    // }
    // catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("ArrayIndexOutOfBoundsException");
    // }



    // NESTED TRY AND CATCH
    // try{
    //     try{
    //         int num=Integer.parseInt("chandra");
    //         System.out.println(num);
    //     }
    //     catch(NumberFormatException e){
    //         System.out.println("NumberFormatException");
    //     }

    //     try{
    //         int arr[]=new int[5];
    //         arr[7]=0;
    //     }
    //     catch(Exception e){
    //         System.out.println("handled");
    //     }
    //     System.out.println("other statements");

    // }
    // catch(Exception e){
    //     System.out.println("handled and recovered");
    // }
   

// -----------------------------------finally----------------------------------------------------


    // try{
    //         int num=Integer.parseInt("chandra");
    //         System.out.println(num);
    // }
    // finally{
    //     System.out.println("finally block is always executing");
        
    // }



    // -----------------------------------throw----------------------------------------------------
    // avg();



    // -----------------------------------throws----------------------------------------------------
    // try{
    //     avg1();
    // }
    // finally{
    //     System.out.println("caught");
    // }


    // -----------------------------------USER DEFINE EXCEPTION----------------------------------------------------

    // try{
    //     throw new MyException(5);
    // }
    // catch(Exception c){
    //     System.out.println(c);
    // }

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number less than 100");
    int number=sc.nextInt();
    try{
        validateInput(number);
    }
    catch(InvalidInputException e){
        System.out.println("caught exception-input is greater than 100");
    }
}   
}
class MyException extends Exception{
    int a;
    MyException(int b){
        a=b;
    }
    public String toString(){
        return ("Exception number: " + a);
    }
}

class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}
