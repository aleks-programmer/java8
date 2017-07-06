package patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleks on 06.07.17.
 */
public class CompositeCircle implements Graphic {
    private List<Graphic> children = new ArrayList<Graphic>();

    public void paint() {
        children.add(new Space());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());
        children.add(new CoordinateOffset(CoordinateOffset.Offset.OFFSET_DOWN));
        children.add(new Point());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Point());
        children.add(new CoordinateOffset(CoordinateOffset.Offset.OFFSET_DOWN));
        children.add(new Point());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Point());
        children.add(new CoordinateOffset(CoordinateOffset.Offset.OFFSET_DOWN));
        children.add(new Point());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Space());
        children.add(new Point());
        children.add(new CoordinateOffset(CoordinateOffset.Offset.OFFSET_DOWN));
        children.add(new Space());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());
        children.add(new Point());

        for(Graphic g: children){
            g.paint();
        }
    }

    public void add(Graphic g) {
        children.add(g);
    }

    public void remove(Graphic g) {
        if (children.contains(g)) {
            children.remove(g);
        }
    }

    public Graphic get(int index) {
        if (index < children.size()) {
            return children.get(index);
        }
        return null;
    }
}
