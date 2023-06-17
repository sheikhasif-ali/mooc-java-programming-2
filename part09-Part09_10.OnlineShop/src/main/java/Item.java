import java.util.Map;

public class Item {

        private String name;
        private int price;
        private int quantity;

        public String getName() {
            return this.name;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public Item(String product, int qty, int unitPrice) {
            this.name = product;
            this.quantity = qty;
            this.price = unitPrice;
        }

        public int price() {
            return this.price*this.quantity;
        }

        public void increaseQuantity() {
            this.quantity += 1;
        }

        public String toString() {
            return this.name + ": " + this.quantity;
        }
}
