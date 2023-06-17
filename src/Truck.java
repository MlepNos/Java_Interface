public class Truck implements Trackable{
    @Override
    public void Track() {
        System.out.println(getClass().getSimpleName() + " is Trackable");
    }
}
