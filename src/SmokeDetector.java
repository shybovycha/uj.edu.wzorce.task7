/**
 * Created by shybovycha on 20.04.15.
 */
public class SmokeDetector extends Observable implements IDetector {
    protected boolean smokeDetected = false;

    public SmokeDetector() {

    }

    public void addSmokeObserver(SmokeIObserver o) {
        addObserver(o);
    }

    public void setSmokeDetected(boolean v) {
        this.smokeDetected = v;

        if (v) {
            notifyObservers();
        }
    }

    public boolean hasSmokeBeenDetected() {
        return isTriggered();
    }

    @Override
    public boolean isTriggered() {
        return this.smokeDetected;
    }

    @Override
    public void accept(IVisitor v) {
        v.operation(this);
    }
}
