/*
Practice Question — Inheritance

Question:

Create a program to demonstrate Single Inheritance.

🧱 Requirements:

Create a base class called Person.

Property: name

Method: showName() → prints "Name: [name]"

Create a child class called Student that inherits from Person.

Property: grade

Method: showGrade() → prints "Grade: [grade]"

In the main() method:

Create an object of Student

Set the name and grade

Call both methods (showName() and showGrade())
*/
class Person{
    String name;

     void showName() {
System.out.println("Name :"+name);
     }
}
class Student extends Person{
    String grade;
    public void showGrade(){
        System.out.println("Grade : "+grade);
    }


}
public class inheritance{
    public static void main(String[] args) {
        
    Student s1=new Student();
    s1.name="Rajan";
    s1.grade="A";

    s1.showName();
    s1.showGrade();
    }

}