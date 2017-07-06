package patterns.flyweight;

import java.awt.*;

/**
 * Created by aleks on 29.06.17.
 */
public class Line implements LineFlyweight {

    private Color color;

    public Line(Color c) {
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Point location) {//draw the character on screen}
    }
}