class Person{
    String name;
    void showName(){
        System.out.println("Name : "+name);
    }
}
class Student extends Person{
    String grade;
    void showGrade(){
        System.out.println("Grade : "+grade);
    }
}
class BoardStudent extends Student{
    String boardname;
    void showBoard(){
        System.out.println("BoardName : "+boardname);
    }
}
public class Multilevel_Inheritance{
    public static void main(String[] args) {
        BoardStudent bs=new BoardStudent();
        bs.name="Rajan";
        bs.grade="A";
        bs.boardname="Btcs";
        bs.showName();
        bs.showGrade();
        bs.showBoard();
    }
}