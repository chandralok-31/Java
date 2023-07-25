import java.util.*;
public class arrayList{
    public static void main(String[] args){
       ArrayList<Integer> list=new ArrayList<Integer>();
    //    ArrayList<String> list=new ArrayList<String>();
    //    ArrayList<boolean> list=new ArrayList<boolean>();

    // add elements 
    list.add(0);
    list.add(2);
    list.add(3);
    System.out.println(list);


    // to get elements
    // int element=list.get(1);
    // System.out.println(element);
    System.out.println(list.get(2));


    // add elements in between
    list.add(1,-1);
    System.out.println(list);

    // set/modify elements
    list.set(0,4);
    System.out.println(list);


    // delete elements
    list.remove(2);
    System.out.println(list);

    // size of list
    System.out.println(list.size());


    // loop in array list
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }

    // sorting array
    Collections.sort(list);
    System.out.print(list+" ");

    }
}