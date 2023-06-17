public class CustomTacoBox implements TacoBox {
    private int taco;

    public CustomTacoBox(int tacos) {
        this.taco = tacos;
    }

    public int tacosRemaining() {
        return this.taco;
    }

    public void eat() {
        if (this.taco > 0) {
            this.taco -= 1;

        } else if (this.taco == 0) {
            this.taco = 0;
        }
    } 

}
