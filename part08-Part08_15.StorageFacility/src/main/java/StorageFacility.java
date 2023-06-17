import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> inventory;

    public StorageFacility() {
        this.inventory = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.inventory.putIfAbsent(unit, new ArrayList<>());

        this.inventory.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!(inventory.containsKey(storageUnit))) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        } else {
            return inventory.get(storageUnit);
        }
    }

    public void remove(String storageUnit, String item) {
        if(this.inventory.get(storageUnit).contains(item)) {
            this.inventory.get(storageUnit).remove(item);
        } else {
            this.inventory.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();

        for(String loop: inventory.keySet()) {
            if(!(inventory.get(loop).isEmpty()) ) {
                list.add(loop);
            }
        }
        return list;
    }
}
