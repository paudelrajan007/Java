/* 
📝 Practice Question (Your Turn)

Task:

Create a class Student

Properties: name (String), age (int)

Method: study() → prints: "name is studying"

Create 2 objects of Student and call their study() methods
*/
class Student{
    String name;
    int age;

     public void study(){
        System.out.println(this.name);
        System.out.println(this.age);
     }
    }
    public class oops2{
        public static void main(String[] args) {
            Student s1=new Student();
            s1.name="AMIT";
            s1.age=21;
            Student s2=new Student();
            s2.name="ajay";
            s2.age=22;
            s1.study();
            s2.study();


    }
    }
       
    
        
    
