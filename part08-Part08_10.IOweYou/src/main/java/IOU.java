import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String loop : iou.keySet()) {
            if (loop.contains(toWhom)) {
                return this.iou.getOrDefault(toWhom, 0.00);
            }
        }
        return 0.00;
    }
}
