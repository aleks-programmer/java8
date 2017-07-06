package patterns;

import patterns.composite.CompositeCircle;
import patterns.composite.GraphicsClient;
import patterns.flyweight.LineFlyweight;
import patterns.flyweight.LineFlyweightFactory;
import patterns.state.MP3PlayerContext;
import patterns.template_method.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        /* START Template method design pattern */
//        CrossCompiler iphone = new IPhoneCompiler();
//        iphone.crossCompile();
//        CrossCompiler android = new AndroidCompiler();
//        android.crossCompile();
//        /* END Template method design pattern */
//
//        /* START Flyweight design pattern */
//        LineFlyweightFactory factory = new LineFlyweightFactory();
//        LineFlyweight line = factory.getLine(Color.RED);
//        LineFlyweight line2 = factory.getLine(Color.RED);
//        //can use the lines independently
//        line.draw(new Point(100, 100));
//        line2.draw(new Point(200, 100));
//         /* END Flyweight design pattern */

         /* START Composite design pattern */
        GraphicsClient graphicsClient = new GraphicsClient();
        graphicsClient.paint(new CompositeCircle());
         /* END Composite design pattern */

    }
}
