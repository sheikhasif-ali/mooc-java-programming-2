import java.util.ArrayList;

public class MisplacingBox extends Box{
    ArrayList<Item> list;

    public MisplacingBox() {
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        this.list.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
