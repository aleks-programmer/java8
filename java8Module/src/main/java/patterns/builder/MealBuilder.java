package patterns.builder;

/**
 * Created by aleks on 06.07.17.
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();
    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildDessert();
    public abstract Meal getMeal();
}
