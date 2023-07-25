import java.util.*;
public class recursion3 {



    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }


    public static void findSubset(int n,ArrayList<Integer> subset){

        if(n==0){
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n-1, subset);

        // add nhi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);


    }


    public static int callGuests(int n){

        if(n<=1){
            return 1;
        }
        int way1= callGuests(n-1);
        int way2=(n-1)*callGuests(n-2);
        return way1 + way2;
    }



    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int vertPlacement =placeTiles(n-m, m);
        int horPlacement =placeTiles(n-1, m);
        return vertPlacement + horPlacement;
    }



    public static int countPath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        int downPath=countPath(i+1, j, n, m);
        int rightPath=countPath(i, j+1, n, m);
        return downPath+rightPath;
    }


    public static void printPermutations(String s,String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curChar=s.charAt(i);
            String newstring=s.substring(0, i)+s.substring(i+1);
            printPermutations(newstring,permutation+curChar);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        // permutation
        // String s=sc.next();
        // String permutation="";
        // printPermutations(s, permutation);




        // count path
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int x=countPath(0, 0, n, m);
        // System.out.println(x);


        // tiles placement
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int x=placeTiles(n, m);
        // System.out.println(x);



        // call guests
        // int n=sc.nextInt();
        // int x=callGuests(n);
        // System.out.println(x);




        // subset
        int n=sc.nextInt();
        ArrayList<Integer> subset=new ArrayList<Integer>();
        findSubset(n, subset);



    }
}
