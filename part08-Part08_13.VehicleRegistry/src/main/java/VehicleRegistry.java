import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owned = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate loop : this.owned.keySet()) {
            if (loop.equals(licensePlate)) {

                if(owned.get(licensePlate) == null) {

                    String test = owned.get(licensePlate);
                    System.out.println(test);
                    return true;
                    
                } else if (!(owned.get(licensePlate) == null)) {
                    return false;
                }
            }
        }
        owned.put(licensePlate, owner);
        return true;
    }

   
    public String get(LicensePlate licensePlate) {
        if(this.owned.containsKey(licensePlate)) {
            System.out.println(this.owned.get(licensePlate));
            return this.owned.get(licensePlate);
        } else {
            System.out.println(this.owned.get(licensePlate));
            return null;
        }
            
    }

    public boolean remove(LicensePlate licensePlate) {
        if(this.owned.containsKey(licensePlate)) {
            owned.remove(licensePlate, owned.get(licensePlate));
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for(LicensePlate loop: owned.keySet()) {
            System.out.println(loop);
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();
        for(String loop: owned.values()) {
            if(!(names.contains(loop))) {
                names.add(loop);
            }
        }
        for(String loop: names) {
            System.out.println(loop);
        }
    }
}