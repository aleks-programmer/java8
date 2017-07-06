package patterns.composite;

/**
 * Created by aleks on 06.07.17.
 */
public class CoordinateOffset implements Graphic {
    private Offset offset;

    public CoordinateOffset (Offset offset) {
        this.offset = offset;
    }

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
        if (offset.equals(Offset.OFFSET_RIGHT)) System.out.print(" ");
        if (offset.equals(Offset.OFFSET_DOWN)) System.out.println("");
    }

    public enum Offset {
        OFFSET_RIGHT, OFFSET_DOWN
    }
}
