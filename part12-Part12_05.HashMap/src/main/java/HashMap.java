import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<ArrayList<Pair<K, V>>> values;
    private int size;

    public HashMap() {
        this.values = new ArrayList<>();
        this.size = 0;
        for (int i = 0; i < 32; i++) {
            this.values.add(new ArrayList<>());
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        ArrayList<Pair<K, V>> pairs = values.get(index);
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        ArrayList<Pair<K, V>> pairs = values.get(index);
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        pairs.add(new Pair<>(key, value));
        size++;
    }

    public V remove(K key) {
        int index = getIndex(key);
        ArrayList<Pair<K, V>> pairs = values.get(index);
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                V value = pair.getValue();
                pairs.remove(pair);
                size--;
                return value;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % values.size());
    }

   
}