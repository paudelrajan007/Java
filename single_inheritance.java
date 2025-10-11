// single inharents 

class Person{
    String name;
    void showName(){
        System.out.println("Name : "+name);

    }
}
class Student extends Person{
    String grade;
    void showGrade(){
        System.out.println("Grade : " +grade);
    }

}
public class single_inheritance{
    public static void main(String[] args){
        Student s1 =new Student();
        s1.name="Rajan";
        s1.grade="A";
        
        s1.showName();
        s1.showGrade();
    }
}
