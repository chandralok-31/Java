import java.util.*;
public class function_method {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static int addNumber(int val1, int val2) {
        return (val1+val2);
    }

    public static int prod(int val1, int val2){
        return (val1*val2);
    }
    public static int factorial(int x){
        if (x<=1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int sum1=addNumber(a,b);
        // System.out.println(sum1);
        // String name=sc.next();
        // printMyName(name);
        // int prod1=prod(a, b);
        // System.out.println(prod1);
        int fact=factorial(b);
        System.out.println(fact);
    }
}
