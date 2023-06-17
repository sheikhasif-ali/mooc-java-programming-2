public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        history.add(this.getBalance());

    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double temp = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return temp;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n" + "History: " + history.toString() +  "\n" + "Largest amount of product: " + history.maxValue() + "\n" + "Smallest amount of product: " + history.minValue() + "\n" + "Average: " + history.average() );
    }

    public String history() {
        return String.valueOf(history);
    }
}
