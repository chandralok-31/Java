import java.util.*;
public class basic_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();


        // rectangle pattern
        // *****
        // *****
        // *****
        // *****
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Hollow rectangle pattern
        // *****
        // *   *
        // *   *
        // *****
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || i==n || j==1 || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Half pyramid pattern
        // *
        // **
        // ***
        // ****
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }



        // inverted half pyramid pattern
        //    *
        //   **
        //  ***
        // ****
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
            
        // }



        // half pyramid pattern rotated by angle 180
        //    *
        //   **
        //  ***
        // ****
        // for(int i=1; i<=n; i++){
        //     for(int k=1;k<=n-i; k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // number
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1 
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        // }
        // System.out.println();
        // }



        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15
        // int x=1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(x+" ");
        //         x++;
        //     }
        //     System.out.println();
        // }





        // 1 
        // 0 1 
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         if ((i+j)%2==0){
        //             System.out.print(1+" ");
        //         }
        //         else{
        //             System.out.print(0+" ");
        //         }  
        //     }
        //     System.out.println();
        // }

        



        
    }
    
}
