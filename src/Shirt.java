/**
 * Created by MattBrown on 10/13/15.
 */
public class Shirt extends InventoryItem {
    public Shirt(String name, int count, String category){
        super(name, count, category);
        this.name = name;
        this.count = count;
        this.category = "Shirt";
    }
}
