package patterns.composite;

/**
 * Created by aleks on 06.07.17.
 */
public class SimpleGraphic implements Graphic {
    @Override
    public void add(Graphic g) {

    }

    @Override
    public void remove(Graphic g) {

    }

    @Override
    public Graphic get(int index) {
        return null;
    }

    @Override
    public void paint() {
        System.out.println("run paint operation");
    }
}
