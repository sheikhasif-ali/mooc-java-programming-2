public class Container {
    private int cont;

    public Container() {
        this.cont = 0;
    }

    public int contains() {
        return this.cont;
    }

    public void add(int amount) {
        if(amount>0) {
            this.cont += amount;
            if(this.cont > 100) {
                this.cont = 100;
            }
            
        }
    }

    public void remove(int amount) {
        this.cont -= amount;
        if(this.cont < 0) {
            this.cont = 0;
        }
    }

    public String toString() {
        return cont + "/100";
    }
}
