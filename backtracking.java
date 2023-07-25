import java.util.*;
public class backtracking {

    public static void printPermutations(String s, String permutation){

        if(s.length()==0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curChar=s.charAt(i);
            String newstring=s.substring(0,i)+s.substring(i+1);
            printPermutations(newstring,permutation+curChar);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String permutation=""; 
        printPermutations(s,permutation);

        
    }
    
}
