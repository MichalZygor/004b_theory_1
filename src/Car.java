public class Car {
    int year;
    String brand;
    String model;
    String color;

    Car(int y, String b, String m, String c){
        this( y, b,  m); //musi być pierwsza instrukcją!!!
        color = c;
//        System.out.println("Konstruktor 1");
    }

    Car(int y, String b, String m){
        year = y;
        brand = b;
        model = m;
//        System.out.println("Konstruktor 2");
    }

}
