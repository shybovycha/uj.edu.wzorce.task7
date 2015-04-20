/**
 * Created by shybovycha on 20.04.15.
 */
public class SmokeIObserver implements IObserver {
    protected boolean isSmoke = false;

    public SmokeIObserver() {

    }

    public boolean getIsSmoke() {
        return this.isSmoke;
    }

    @Override
    public void handle(Observable o) {
        boolean isSmoke = ((SmokeDetector) o).hasSmokeBeenDetected();

        if (isSmoke)
            System.out.printf("Smoke has been detected!\n"); else
                System.out.printf("No smoke has been detected.\n");
    }
}
