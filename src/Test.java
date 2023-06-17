public class Test {


    public static void main(String[] args) {


        inFlight(new Jet());
//        OrbitEarth.log("Testing " + new Satellite() );  we would get an error because log method is private

        orbit(new Satellite());

    }

    private static void inFlight(FlightEnabled flier){
        flier.TakeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.Track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier){
        flier.TakeOff();
        flier.fly();
        flier.land();
    }


}
