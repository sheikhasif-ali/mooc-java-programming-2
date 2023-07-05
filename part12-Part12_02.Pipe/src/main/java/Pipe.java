import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipe;

    public Pipe () {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if(pipe.isEmpty()) {
            return null;
        } else {
            T temp = pipe.get(0);
            pipe.remove(0);
            return temp;

        }
    }

    public boolean isInPipe() {
        if(pipe.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
