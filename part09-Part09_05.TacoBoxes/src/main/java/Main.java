
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox boxy = new TripleTacoBox();
        boxy.eat();
        boxy.eat();
        System.out.println(boxy.tacosRemaining());
        boxy.eat();
        System.out.println(boxy.tacosRemaining());
        boxy.eat();
        System.out.println(boxy.tacosRemaining());
    }
}
