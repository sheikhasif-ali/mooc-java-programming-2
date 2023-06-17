import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    // private List<Item> list;
    private Map<String, Item> list;

    public ShoppingCart() {
        this.list = new HashMap();
        // this.list = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item temp = new Item(product, 1, price);
        if(list.containsKey(product)) {
            list.get(product).increaseQuantity();
        } else {
            list.put(product, temp);

        }


        // list.add(temp);
    }

    public int price() {
        int bill = 0;
        for(Item loop: list.values()) {
            bill += loop.price();
        }
        return bill;
    } 

    public void print() {
            for(Item loop: list.values()) {
                System.out.println(loop.getName() + ": " + loop.getQuantity());
            }
    }
}
