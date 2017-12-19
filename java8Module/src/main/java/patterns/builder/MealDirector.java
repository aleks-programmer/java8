package patterns.builder;

/**
 * Created by aleks on 06.07.17.
 */
public class MealDirector {
    public Meal createMeal(MealBuilder builder) {
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        return builder.getMeal();
    }
}
