import java.util.*;
public class recursion1 {
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        // System.out.print(n+" ");    //see the difference 
        printNumber(n-1);
        System.out.print(n+" ");
    }
    public static void sumNumber(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumNumber(i+1,n,sum);
        System.out.println(i);

    }
    public static void factorial(int prod,int n){
        if(n==0){
            System.out.println(prod);
            return;
        }
        prod*=n;
        factorial(prod, n-1);


    }
    public static int fibonacci(int n){
        // if(n==0){
        //     System.out.println(f2);
        //     return;
        // }
        // int temp=f1+f2;
        // f1=f2;
        // f2=temp;
        // fibonacci(n-1, f1, f2);
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        
    }
    public static int power (int x,int n){
        if (x==0){
            return 0;
        }
        if(n==0 ){
            return 1;
        }
        // return x*(power(x,n-1));
        if (n%2==0){
        return power(x,n/2)*power(x, n/2);
        }
        else{
            return x*power(x,(n-1)/2)*power(x,(n-1)/2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // printNumber(n);
        int sum=0;
        // sumNumber(1,n,sum);
        int prod=1;
        // factorial(prod, n);
        // int x=fibonacci(n);
        // System.out.println(x);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int y=power(x,n);
        System.out.println(y);

        
    }
}
