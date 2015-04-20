/**
 * Created by shybovycha on 20.04.15.
 */
public class FireAlarm extends Observable implements IObserver, IDetector {
    protected Thermometer thermometer;
    protected SmokeDetector smokeDetector;
    // protected SmokeObserver smokeObserver;
    // protected TemperatureObserver temperatureObserver;

    public FireAlarm() {
        super();

        this.thermometer = new Thermometer(20);
        this.smokeDetector = new SmokeDetector();

        // this.smokeObserver = new SmokeObserver();
        // this.temperatureObserver = new TemperatureObserver();

        this.thermometer.addObserver(this);
        this.smokeDetector.addObserver(this);
    }

    public FireAlarm(Thermometer t, SmokeDetector s) {
        super();

        this.thermometer = t;
        this.smokeDetector = s;

        // this.smokeObserver = new SmokeObserver();
        // this.temperatureObserver = new TemperatureObserver();

        this.thermometer.addObserver(this);
        this.smokeDetector.addObserver(this);
    }

    public void letsMakeSomeFire() {
        this.thermometer.setTemperature(200);
        this.smokeDetector.setSmokeDetected(true);
    }

    public void addFireObserver(IObserver o) {
        addObserver(o);
    }

    @Override
    public void handle(Observable o) {
        // if (this.smokeObserver.getIsSmoke() && this.temperatureObserver.getIsOverheat())
        if (this.isTriggered()) {
            System.out.println("ALARM!");

            notifyObservers();
        }
    }

    @Override
    public boolean isTriggered() {
        return (this.smokeDetector.hasSmokeBeenDetected() && this.thermometer.getTemperature() > 60.0);
    }

    @Override
    public void accept(IVisitor v) {
        v.operation(this);
    }
}
