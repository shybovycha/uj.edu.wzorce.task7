/**
 * Created by shybovycha on 20.04.15.
 */
public interface IIterator<T> {
    public void reset();
    public boolean hasNext();
    public T next();
}
