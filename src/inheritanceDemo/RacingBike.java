package inheritanceDemo;

public class RacingBike extends Bike {
    @Override
    public void start() {
        System.out.println("Racing Bike starts");
    }


    @Override
    public void stop() {
        System.out.println("Racing Bike stops");
    }
}
