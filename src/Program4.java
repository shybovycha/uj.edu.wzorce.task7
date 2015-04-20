public class Program4 {
    public static void main(String[] args) {
        Building b = new Building();

        RoomWithDetectors r = new RoomWithDetectors();
        r.addDetector(new FireAlarm());
        r.addDetector(new FireAlarm());
        r.addDetector(new FireAlarm(new Thermometer(59), new SmokeDetector()));

        b.addRoom(r);

        r = new RoomWithDetectors();
        r.addDetector(new Thermometer(15));

        b.addRoom(r);

        IVisitor v = new FireStarterVisitor();

        for (IIterator<RoomWithDetectors> i = new RoomIterator(b); i.hasNext(); ) {
            r = i.next();

            for (IIterator<IDetector> t = new DetectorIterator(r); t.hasNext(); ) {
                IDetector d = t.next();

                System.out.printf("Before: %b\n", d.isTriggered());

                d.accept(v);

                System.out.printf("After: %b\n", d.isTriggered());
            }
        }
    }
}