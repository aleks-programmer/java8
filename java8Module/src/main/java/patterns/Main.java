package patterns;

import patterns.abstractfactory.AbstractWidgetFactory;
import patterns.abstractfactory.GUIBuilder;
import patterns.abstractfactory.MacOSXWidgetFactory;
import patterns.abstractfactory.MsWindowsWidgetFactory;
import patterns.builder.*;
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

         /* START Builder design pattern */
        boolean isKid = false;
        MealDirector director = new MealDirector();
        MealBuilder builder;
        if (isKid) {
            builder = new KidsMealBuilder();
        }
        else{
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
        /* END Builder design pattern */

        /* START Abstract factory design pattern */
        GUIBuilder builder1 = new GUIBuilder();
        AbstractWidgetFactory widgetFactory = null;
        //check what platform we're on
        if(Platform.currentPlatform()=="MACOSX"){
            widgetFactory  = new MacOSXWidgetFactory();
        } else {
            widgetFactory  = new MsWindowsWidgetFactory();
        }
        builder1.buildWindow(widgetFactory);
        /* END Abstract factory design pattern */
    }
}
