import java.util.ArrayList;
import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object item) {
        if (item == null) {
            return false;
        }

        if (item.getClass() != this.getClass()) {
            return false;
        }

        final Item other = (Item) item;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        char[] singles;
        singles = this.name.toCharArray();
        ArrayList<Integer> hasher = new ArrayList<>();
        int hash = 0;

        for (char loop : singles) {
            hasher.add((int) loop);
        }

        int j = 1;
        for (int i = 0; i < hasher.size(); i++) {
            hash += hasher.get(i) * j;
            j *= 10;
            System.out.println("Index " + hasher.get(i));
            System.out.println("Hash " + hash);
        }
        return hash;
    }
}
