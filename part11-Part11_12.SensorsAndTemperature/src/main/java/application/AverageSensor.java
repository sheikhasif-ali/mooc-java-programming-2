package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> list;
    private List<Integer> readings;

    public AverageSensor() {
        list = new ArrayList<>();
        readings = new ArrayList<>();
    }
    public void setOff() {
        this.list.stream()
        .forEach(sens -> sens.setOff());
    }
    
    public void setOn() {
        this.list.stream()
        .forEach(sens -> sens.setOn());

    }

    public boolean isOn() {
        if(list.stream()
        .allMatch(sens -> sens.isOn()) == true) {
            return true;
        } else {
            return false;
        }
        
    }

    public int read() {
        if(this.isOn() == false || list.isEmpty()) {
            throw new IllegalStateException("error");
        }
        double temp =  list.stream()
            .mapToInt(sens -> sens.read())
            .average().getAsDouble();

            readings.add((int)(temp));
        return (int)(temp); 
    }

    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }
}
