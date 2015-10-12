import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MattBrown on 10/12/15.
 */
public class Inventory {
    public static void main(String[] args){
    ArrayList<InventoryItem> inventory = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    while (true) {

        for (InventoryItem element: inventory){
            System.out.println(element.count + " " + element.name);
        }

        System.out.println("Welcome to your inventory!");
        System.out.println("What would you like to do?");

        System.out.println("[1] Add new item to inventory");
        System.out.println("[2] Remove item from inventory");
        System.out.println("[3] Additional amount");
        System.out.println("[4] View inventory list");

        String option = scanner.nextLine();
        int optionNum = Integer.valueOf(option);
        if (optionNum == 1) {
            System.out.println("What item would you like to add to your inventory?");
            String newItem = scanner.nextLine();
            InventoryItem item = new InventoryItem(newItem);
            inventory.add(item);
        } else if (optionNum == 2) {
                System.out.println("What item would you like to remove from your inventory?");
                String select = scanner.nextLine();
            for (InventoryItem element: inventory){
                if (element.name.equals(select)){
                    inventory.remove(element);
                    break;
                }
            }
        } else if (optionNum == 3) {
                System.out.println("Which item would you like to update?");
                String lineNumStr = scanner.nextLine();
                int lineNum = Integer.valueOf(lineNumStr)- 1;
                InventoryItem item = inventory.get(lineNum);
            System.out.println("What is your new amount");
                String newAmountStr = scanner.nextLine();
                int newAmount = Integer.valueOf(newAmountStr);
            item.count = newAmount;
        }

        }
    }
}
