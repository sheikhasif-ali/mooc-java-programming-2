package application;

public class StandardSensor implements Sensor{
    private int state;

    public StandardSensor(int state) {
        this.state = state;
    }

    public int read() {
        return this.state;
    }

    public void setOff() {
    }

    public void setOn() {

    }
    public boolean isOn() {
        return true;
    }
}
