/**
 * Created by shybovycha on 20.04.15.
 */
public class Program2 {
    public static void main(String[] args) {
        Building b = new Building();

        RoomWithDetectors r = new RoomWithDetectors();
        r.addDetector(new Thermometer(32));
        r.addDetector(new Thermometer(37));
        r.addDetector(new Thermometer(20));
        r.addDetector(new SmokeDetector());
        r.addDetector(new SmokeDetector());

        b.addRoom(r);

        r = new RoomWithDetectors();
        r.addDetector(new Thermometer(15));
        r.addDetector(new SmokeDetector());

        b.addRoom(r);

        for (IIterator<RoomWithDetectors> i = new RoomIterator(b); i.hasNext(); ) {
            r = i.next();

            for (IIterator<IDetector> t = new DetectorIterator(r); t.hasNext(); ) {
                IDetector d = t.next();

                System.out.println(d.isTriggered());
            }
        }
    }
}
