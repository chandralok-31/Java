class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }
}
public class static_in_java{
    public static void main(String[] args){
        Student.school="sav";
        Student s1=new Student();
        s1.name="chandra";
        System.out.println(s1.school);


    }
}