import java.util.*;
public class bitmanipulation {
    public static void main(String[] args){


        // get bit
        // int n=5;
        // int pos=2;
        // int bitMask=1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }



        // set bit
        // int n=7;
        // int pos=1;
        // int bitMask=1<<pos;

        // int newNUmber=bitMask | n;
        // System.out.println(newNUmber);



        // clear bit
        // int n=5;
        // int pos=2;
        // int bitMask=1<<pos;

        // int newNumber=(~bitMask & n);
        // System.out.println(newNumber);



        // update bit
        Scanner sc=new Scanner(System.in);
        int opr=sc.nextInt(); // update bit to 1 else update bit to 0
        int n=sc.nextInt();
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        if(opr==1) {
            //set bit
            int newNumber=(bitMask | n);
            System.out.println(newNumber);
        }
        else{
            //clear bit
            int newNumber=(~bitMask & n);
            System.out.println(newNumber);
        }

















    }
}
