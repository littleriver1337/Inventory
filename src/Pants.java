/**
 * Created by MattBrown on 10/13/15.
 */
public class Pants extends InventoryItem {
    public Pants(String name, int count, String category){
        super(name, count, category);
        this.name = name;
        this.count = count;
        this.category = "Pants";
    }
}
