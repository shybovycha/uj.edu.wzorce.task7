/**
 * Created by shybovycha on 20.04.15.
 */
public abstract class ILinearListIterator<T> implements IIterator<T> {
    protected int index = 0;
    protected IIterable<T> collection;

    public ILinearListIterator(IIterable<T> c) {
        this.index = 0;
        this.collection = c;
    }

    public void reset() {
        this.index = 0;
    }

    public boolean hasNext() {
        return this.index < this.collection.size();
    }

    public T next() {
        if (this.hasNext())
            return this.collection.get(this.index++); else
                return null;
    }
}
