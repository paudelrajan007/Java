/*
Definition:

When multiple methods in the same class have the same name but different parameters (type or number).

💡 Real-life Example:

Imagine a printer.

It can print a document (String).

It can print pages (int).

It can print a photo (Image).

Same “print” function → works differently based on input.
*/
class Calculator{

int add(int a , int b){
    return a+b;
}
int add(int a, int b, int c){
    return a+b+c;
}
double add(double a, double b){
    return a+b;
}
}
public class Method_Overloadingpolymorphism{
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.err.println("Add 2 integers : " +calc.add(10,31));
        System.err.println("Add 3 integers : " +calc.add(10,31,22));
        System.err.println("Add 2 doubles : " +calc.add(10.0,31.12));

    }
}