import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        bird.move();
        bird.fly();

        System.out.println("-".repeat(30));

 //       flier.fly();
 //       flier.TakeOff();
 //       tracked.Track();
 //       flier.land();

        inFlight(flier);
        System.out.println("-".repeat(30));

        inFlight(new Jet());
        System.out.println("-".repeat(30));

        Truck truck = new Truck();
        truck.Track();
        System.out.println("-".repeat(30));

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The Truck traveled %.2f km or %.2f miles %n",kmsTraveled,milesTraveled);

        System.out.println("-".repeat(30));
        System.out.println(SayMyName.MyName);
        System.out.println("-".repeat(30));


        Satellite sat = new Satellite();
        sat.achieveOrbit();
        System.out.println("-".repeat(30));

        System.out.println("1");


        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);


        List<FlightEnabled> betterFliere = new LinkedList<>();
        betterFliere.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        System.out.println("-".repeat(30));
        triggerFliers(betterFliere);
        flyFliers(betterFliere);
        landFliers(betterFliere);

        //triggerFliers(betterFliere);
    }


    private static void inFlight(FlightEnabled flier){
        flier.TakeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.Track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
     for(var flier : fliers){
         flier.TakeOff();
     }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }
}