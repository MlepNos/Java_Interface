//Java is called Single Inheritance
//A class can exten only one class but it can implement more than one interfaces
public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Flaps wings");
    }

    @Override
    public void TakeOff() {
        System.out.println(getClass().getSimpleName() + " Took off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is Landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is Flying");
    }

    @Override
    public void Track() {
        System.out.println(getClass().getSimpleName() + " is Trackable");
    }
}
