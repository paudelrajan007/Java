/*
Create a class Book.

Properties:

title (String)

author (String)

Method: display() → prints: "Title: [title], Author: [author]".

In the main method:

Create 2 objects of Book

Assign values to their properties

Call display() for both objects

*/
class Book{
    String title;
    String audio;
    public void display(){
        System.out.println("Title"+title+"audio"+audio);
    }

}
public class oops3{
    public static void main(String[] args) {
        Book s1=new Book();
        s1.title="Atomic Habits";
        s1.audio="English";
        Book s2 = new Book();
        s2.title="Think like a monks";
        s2.audio="English";
        
        s1.display();
        s2.display();

    }
}