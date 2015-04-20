import java.util.ArrayList;

/**
 * Created by shybovycha on 20.04.15.
 */
interface Iterator<T> {
    public boolean hasNext();
    public T next();

    public void reset();
}

class NoMoreElementsException extends Exception {
    public NoMoreElementsException() {
        super("No more elements in this collection");
    }
}

class ArrayListIterator<T> implements Iterator<T> {
    protected ArrayList<T> items;
    protected int index;

    public ArrayListIterator(ArrayList<T> items) {
        this.items = items;
        this.index = 0;
    }

    @Override
    public void reset() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return (this.index < this.items.size());
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return this.items.get(this.index++);
        } else {
            // throw new NoMoreElementsException();
            return null;
        }
    }
}

public class IteratorTask {
}
