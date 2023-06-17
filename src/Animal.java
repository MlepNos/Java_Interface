
enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void Track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1) % allStages.length];
    }
}
record DragonFly(String name,String type) implements FlightEnabled{
    @Override
    public void TakeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth{

   public FlightStages stage = FlightStages.GROUNDED;
    @Override
    public void achieveOrbit() {
        transition("Orbit Achieved");
    }

    @Override
    public void TakeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        transition("flying");
    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.Track();
    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage,String description){
        description = stage + " : " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage,"Beginning Transition to " + nextStage);
        return nextStage;
    }
}



interface SayMyName{
    String MyName = "Heisenberg";
}

interface FlightEnabled{

    // the 2 members below are "public static final"
    double MILES_TO_KM = 1.60935;
    double KM_TO_MILES = 0.621371;

    // the declarations of the methods below are all the same
    public abstract void TakeOff();
    abstract void land();
    void fly();

    default FlightStages transition(FlightStages stage){
 //       System.out.println("transition not implemented on " + getClass().getName());
 //       return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from "+ stage + " to "+ nextStage);
        return nextStage;

    }
}

interface Trackable{
    void Track();
}


public abstract class Animal {

public abstract void move();


}
