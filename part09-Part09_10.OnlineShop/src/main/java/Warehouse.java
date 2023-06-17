import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceList;
    private Map<String, Integer> stockList;

    public Warehouse() {
        priceList = new HashMap<>();
        stockList = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {
        priceList.put(product, price);
        stockList.put(product, stock);
    }

    public int price(String item) {
        if (priceList.containsKey(item)) {
            return priceList.get(item);
        } else {
            return -99;
        }
    }

    public int stock(String item) {
        if (stockList.containsKey(item)) {
            return stockList.get(item);
        } else {
            return 0;
        }
    }

    public boolean take(String item) {
        if (stockList.containsKey(item) && stockList.get(item) >= 1) {
            stockList.put(item, (stockList.get(item) - 1));
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> product = new HashSet();
        product = this.priceList.keySet();
        return product;
    }
}
