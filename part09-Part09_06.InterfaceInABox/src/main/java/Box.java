import java.util.ArrayList;

public class Box implements Packable{

    private double max;
    private ArrayList<Packable> list;

    
    public Box(double maximumCapacity) {
        this.max = maximumCapacity;
        this.list = new ArrayList<>();
    }

    public void add(Packable item) {
        if((this.weight()+item.weight())<this.max) {
            list.add(item);
        }
            
    }

    public double weight() {
        double current = 0.0;
        for(Packable loop: list) {
            current += loop.weight();
        }
        return current;
    }

    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.weight()+ " kg";
    }


}
