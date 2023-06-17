import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = 0.0;
        for(double loop: history ) {
            if(loop > max) {
                max = loop;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        if(!(history.isEmpty())) {
            for(double loop: history) {
                if(loop < min) {
                    min = loop;
                }
            }
        } else {
            min = 0.0;
        }
        return min;

    }

    public double average() {
        double total = 0.0;
        for(double loop: history) {
            total += loop;
        }

        return total/history.size();
    }

    public String toString() {
        
        return String.valueOf(history);
    }
}
