package patterns.flyweight;

import java.awt.*;

/**
 * Created by aleks on 29.06.17.
 */
public interface LineFlyweight {
    public Color getColor();
    public void draw(Point location);
}
