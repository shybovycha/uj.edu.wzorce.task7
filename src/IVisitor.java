/**
 * Created by shybovycha on 20.04.15.
 */
public interface IVisitor {
    public void operation(Thermometer entity);
    public void operation(SmokeDetector entity);
    public void operation(FireAlarm entity);
}
