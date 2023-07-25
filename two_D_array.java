import java.util.*;
public class two_D_array {
    public static void main(String[] args){
        // type[][] arrayName=new type[rows][columns];
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] number=new int[rows][cols];

        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                number[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the number you want to search");
        int x= sc.nextInt();
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                // System.out.print(number[i][j]+" ");
                if (number[i][j]==x){
                    System.out.print(i+","+j);
                }
            }

            System.out.println();
        }
    }
}
