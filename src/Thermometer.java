/**
 * Created by shybovycha on 20.04.15.
 */
public class Thermometer extends Observable implements IDetector {
    protected float temperature;

    public Thermometer(float t) {
        super();
        this.temperature = t;
    }

    public void addTemperatureObserver(TemperatureIObserver o) {
        addObserver(o);
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float t) {
        this.temperature = t;

        notifyObservers();
    }

    @Override
    public boolean isTriggered() {
        return (this.temperature > 60.0);
    }

    @Override
    public void accept(IVisitor v) {
        v.operation(this);
    }
}
