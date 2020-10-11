public class CarShop {
    public static void main(String[] args) {
        Car car = new Car(2017, "Audi", "A5", "czarny");
        Car car2 = new Car(2017, "Audi", "A5");
        System.out.println(car.model + " " + car.color);
        System.out.println(car2.model + " " + car2.color);
        car2.color = "czerwony";
        System.out.println(car2.model + " " + car2.color);
    }
}
