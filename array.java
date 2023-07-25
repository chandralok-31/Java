import java.util.*;
public class array {
    public static void main(String[] args){
        // type[]arrayName = new Type[size]
        // int marks[]={97,98,99};
        // int marks[]=new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=99;
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }


        // user input
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int number[]=new int[size];

        // // input
        // for(int i=0;i<size;i++){
        //     number[i]=sc.nextInt();
        // }

        // // output
        // for(int i=0;i<size;i++){
        //     System.out.println(number[i]);
        // }



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number you want to search");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println("index " + i );
            }
        }

    }
}
