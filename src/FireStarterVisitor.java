/**
 * Created by shybovycha on 20.04.15.
 */
public class FireStarterVisitor implements IVisitor {
    @Override
    public void operation(Thermometer entity) {
        entity.setTemperature(200.0f);
    }

    @Override
    public void operation(SmokeDetector entity) {
        entity.setSmokeDetected(true);
    }

    @Override
    public void operation(FireAlarm entity) {
        entity.letsMakeSomeFire();
    }

    public void operation(IVisitable entity) {
        // nop
        return;
    }
}
