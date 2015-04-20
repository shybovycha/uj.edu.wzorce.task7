import java.util.ArrayList;
import java.util.List;

/**
 * Created by shybovycha on 20.04.15.
 */
public class Building implements IIterable<RoomWithDetectors> {
    protected List<RoomWithDetectors> rooms;

    public Building() {
        this.rooms = new ArrayList<RoomWithDetectors>();
    }

    public void addRoom(RoomWithDetectors r) {
        this.rooms.add(r);
    }

    @Override
    public int size() {
        return this.rooms.size();
    }

    @Override
    public RoomWithDetectors get(int index) {
        return this.rooms.get(index);
    }
}
