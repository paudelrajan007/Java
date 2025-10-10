class Car{
    String color="red";
    int speed=100;
    void drive(){
        System.out.println("The car is driving at "+ speed+"km/h");
    }
}
    public class oops{
        public static void main(String[] args) {
            Car myCar= new Car();
            System.out.println("car color :"+myCar.color);
        myCar.drive();
        }
    }
// constructers 
