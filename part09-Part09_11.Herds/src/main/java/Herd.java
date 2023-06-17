import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable loop: herd) {
            loop.move(dx, dy);
        }
    }

    public String toString() {
        String answer = "";
        for(Movable loop: herd) {
            answer += loop + "\n";
        }
        return answer;
    }
}
