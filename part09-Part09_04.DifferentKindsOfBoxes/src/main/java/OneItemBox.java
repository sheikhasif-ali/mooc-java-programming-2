public class OneItemBox extends Box{
    private Item onlyItem;

    public void add(Item item) {
        if(this.onlyItem == null) {
            this.onlyItem = item;

        }
    }

    public boolean isInBox(Item item) {
        if(this.onlyItem == null) {
            return false;
        }
        if(this.onlyItem.equals(item)) {
            return true;
        } else {
            return false;
        }
    }
}
