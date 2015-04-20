/**
 * Created by shybovycha on 20.04.15.
 */
public class TemperatureIObserver implements IObserver {
    protected boolean isOverheat = false;
    protected float temperatureBarrier = 50.0f;

    public TemperatureIObserver() {

    }

    public boolean getIsOverheat() {
        return this.isOverheat;
    }

    @Override
    public void handle(Observable o) {
        float t = ((Thermometer) o).getTemperature();

        if (t >= this.temperatureBarrier) {
            this.isOverheat = true;
        }
    }
}
