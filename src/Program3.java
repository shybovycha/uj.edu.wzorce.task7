/**
 * Created by shybovycha on 20.04.15.
 */
public class Program3 {
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

        IVisitor v = new FireStarterVisitor();

        for (IIterator<RoomWithDetectors> i = new RoomIterator(b); i.hasNext(); ) {
            r = i.next();

            for (IIterator<IDetector> t = new DetectorIterator(r); t.hasNext(); ) {
                IDetector d = t.next();

                d.accept(v);

                System.out.println(d.isTriggered());
            }
        }
    }
}
