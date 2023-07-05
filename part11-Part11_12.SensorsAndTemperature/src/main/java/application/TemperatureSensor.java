package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean state;
    
    public TemperatureSensor() {
        this.state = false;
    }

    public void setOff() {
        this.state = false;

    }

    public void setOn() {
        this.state = true;

    }

    public boolean isOn() {
        if(state == true) {
            return true;
        } else {
            return false;
        }
    }

    public int read() {
        if(this.state == false) {
            throw new IllegalStateException("illeagal");
        } else {
            int rand = new Random().nextInt(60);
            return rand-30;

        }
    }
}
