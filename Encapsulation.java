class Student{
       private int marks;
       public void setMarks(int m){
        marks=m;
       
}
public int getMarks(){
    return marks;
}
}
public class Encapsulation{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setMarks(85);
        System.out.println(s1.getMarks());
    }
}
