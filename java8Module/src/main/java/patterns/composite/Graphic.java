package patterns.composite;

/**
 * Created by aleks on 06.07.17.
 */
public interface Graphic {
    public void add(Graphic g);
    public void remove(Graphic g);
    public Graphic get(int index);
    public void paint();
}
