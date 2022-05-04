package patterns.prototype;


public abstract class Item {
    private String title;
    private double price;

    public Item clone() {
        Item clonedItem = null;
        try {
            clonedItem = (Item) super.clone();
//            clonedItem.setPrice(price);
//            clonedItem.setTitle(title);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedItem;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}