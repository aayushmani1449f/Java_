public class Car_OOP {
    String brand;
    String model;
    int speed;

    void accelerate(int n) {
        speed = speed + n;
    }

    void deaccelerate(int n) {
        speed = speed - n;
        if (speed < 0) {
            speed = 0;
        }

    }

    static void main() {
        Car_OOP car = new Car_OOP();
        car.brand = "Tata";
        car.model = "Nano";
        car.speed = 40;

        car.accelerate(10);
        System.out.println(car.brand + " " + car.model);
        System.out.println("Speed : " + car.speed);
        car.deaccelerate(20);
        System.out.println("New speed : " + car.speed);

    }
}
