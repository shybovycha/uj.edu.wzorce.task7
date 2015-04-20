import java.util.ArrayList;
import java.util.List;

/**
 * Created by shybovycha on 20.04.15.
 */
public class RoomWithDetectors implements IIterable<IDetector> {
    protected List<IDetector> detectors;

    public RoomWithDetectors() {
        this.detectors = new ArrayList<IDetector>();
    }

    public void addDetector(IDetector d) {
        this.detectors.add(d);
    }

    @Override
    public int size() {
        return this.detectors.size();
    }

    @Override
    public IDetector get(int index) {
        return this.detectors.get(index);
    }
}
