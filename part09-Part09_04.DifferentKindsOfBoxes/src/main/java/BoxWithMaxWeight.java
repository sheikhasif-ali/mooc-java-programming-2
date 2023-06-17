import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> list;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        int currentWeight = 0;
        for(Item loop: list) {
            currentWeight += loop.getWeight();
        }
        if((item.getWeight()+currentWeight)<=this.maxWeight) {
            list.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.list.contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    
}
