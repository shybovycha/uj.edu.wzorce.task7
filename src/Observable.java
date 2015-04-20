import java.util.ArrayList;

/**
 * Created by shybovycha on 20.04.15.
 */
public abstract class Observable {
    protected ArrayList<IObserver> IObservers;

    public Observable() {
        this.IObservers = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver o) {
        this.IObservers.add(o);
    }

    public void notifyObservers() {
        for (IObserver o : this.IObservers) {
            o.handle(this);
        }
    }
}
