class C {

    C(int n, String s) {   // parameterized constructor
        System.out.println("Number: " + n);
        System.out.println("Name: " + s);
    }

    public static void main(String[] args) {
     C obj = new C(5, "Ali");
    }
}
