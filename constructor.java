/*
Practice Question — Constructor

Task:

Create a class Movie.

Properties:

name (String)

rating (double)

Constructor:

Initialize name and rating automatically when the object is created.

Method:

display() → prints: "Movie: [name], Rating: [rating]"

In the main method:

Create 2 objects of Movie using the constructor.

Call display() for both objects.
*/

class Movie{
    String name;
    double rating;

Movie(String n, double r){
name = n;
rating = r;

}
public void display(){
    System.out.println("movie:"+name+"rating"+rating);

}
}
public class constructor{
public static void main(String[] args) {
    Movie m1=new Movie("coolar",5);
    Movie m2=new Movie("puspa",7);
    m1.display();
    m2.display();
}
}