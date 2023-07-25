import java.util.*;
public class stringbuilder {
    public static void main(String[] args){
        // StringBuilder sb=new StringBuilder("Tony");
        // System.out.println(sb);

        // charAt
        // System.out.println(sb.charAt(0));

        // set charat index 0
        // sb.setCharAt(0,'p');
        // System.out.println(sb);




        // insert
        // sb.insert(2,'n');
        // System.out.println(sb);

        // delete
        // sb.delete(2,3);
        // System.out.println(sb);

        // append
        // StringBuilder s=new StringBuilder("H");
        // s.append('e');
        // s.append('l');
        // s.append('l');
        // s.append('o');
        // System.out.println(s);
        // System.out.println(s.length());

        // reverse a string
        StringBuilder s=new StringBuilder("hello");
        System.out.println(s);
        for(int i=0; i<(s.length())/2; i++){
            int front=i;
            int back=s.length()-1-i;

            char frontChar=s.charAt(front);
            char backChar=s.charAt(back);
            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);


        }
        System.out.println(s);









    }
}
