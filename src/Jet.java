public class Jet implements FlightEnabled,Trackable{


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

    @Override
    public FlightStages transition(FlightStages stage) {
       System.out.println(getClass().getSimpleName() + "Transitioning");
       return FlightEnabled.super.transition(stage);
    }
}
