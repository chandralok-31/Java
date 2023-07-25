import java.util.*;
public class recursion2 {
    public static int first=-1;
    public static int last=-1;
    public static boolean map[]=new boolean[26];
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};


    public static void printComb(String s,int idx,String combination){
        if(idx==s.length()){
            System.out.println(combination);
            return;
        }
        char curChar = s.charAt(idx);
        String mapping=keypad[curChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(s, idx+1, combination+mapping.charAt(i));
        }
    }



    public static void subsequences(String s,int idx,String newstring){
        if(idx==s.length()){
            System.out.println(newstring);
            return;
        }
        char curChar=s.charAt(idx);
        subsequences(s,idx+1,newstring+curChar);
        subsequences(s,idx+1,newstring);
    }



    public static void uniqueSubsequences(String s,int idx,String newstring,HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(newstring)){
                return;
            }
            else{
            System.out.println(newstring);
            set.add(newstring);
            return;
            }
        }
        char curChar=s.charAt(idx);
        uniqueSubsequences(s,idx+1,newstring+curChar,set);
        uniqueSubsequences(s,idx+1,newstring,set);
    }



    public static void removeDuplicates(String s,int idx,String newstring){
        if(idx==s.length()){
            System.out.println(newstring);
            return;
        }
        char curChar=s.charAt(idx);
        if(map[curChar-'a']==true){
            removeDuplicates(s,idx+1,newstring);
        }
        else{
            newstring+=curChar;
            map[curChar-'a']=true;
            removeDuplicates(s,idx+1,newstring);
        }
    }

    

    public static void findOccurrence(String s,int idx,char c){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar=s.charAt(idx);
        if(curChar==c){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurrence(s,idx+1,c);


    }



    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }



    public static void reverseString(int n,String s){
        if(n<0){
            return;
        }
        System.out.print(s.charAt(n)+" ");

        reverseString(n-1,s);

    }



    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1) {
        return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr,idx+1);
        }
        else{
            return false;
        }
    }



    public static void moveAllX(String s, int idx,int count,String newstring){
        if(idx==s.length()){
            for(int i=0;i<count;i++){
                newstring+='x';
            }
            System.out.println(newstring);
            return;
        }
        char curChar = s.charAt(idx);
        if(curChar=='x'){
            count+=1;
            moveAllX(s,idx+1,count,newstring);

        }
        else{
            newstring+=curChar;
            moveAllX(s,idx+1,count,newstring);
        }
        for(int i=0;i<count;i++){
            newstring+='x';
        }
        

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // towerOfHanoi(n,"S","H","D");



        // reverse the string
        // int n=sc.nextInt();
        // String s=sc.next();
        // reverseString(s.length()-1,s);




        // find first and last occurrence of string
        // String s = sc.next();
        // int idx=sc.nextInt();
        // char c=sc.next().charAt(0); 
        // findOccurrence(s, idx,c);





        // to check wheather array is sorted or not
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // int idx=sc.nextInt();
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();

        // }
        // boolean x=isSorted(arr, idx);
        // System.out.println(x);




        // move all 'x' to the end of the string
        // String s=sc.nextLine();
        // int idx=sc.nextInt();
        // char c=sc.next().charAt(0);
        // int count=0;
        // String newstring="";
        // moveAllX(s, idx,count,newstring);



        // remove duplicates from the string
        // String s=sc.next();
        // int idx=0;
        // String newstring="";
        // removeDuplicates(s,idx,newstring);




        // subsequences of the string
        // String s=sc.next();
        // int idx=0;
        // String newstring="";
        // subsequences(s,idx,newstring);




        // unique subsequences of the string
        // String s=sc.next();
        // HashSet<String> set=new HashSet<>();
        // int idx=0;
        // String newstring="";
        // uniqueSubsequences(s,idx,newstring,set);




        // keypad combination of number
        String s=sc.next();
        int idx=0;
        String combination="";
        printComb(s,idx,combination);

        


    }
}
