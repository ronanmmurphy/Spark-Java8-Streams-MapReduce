//Ronan Murphy: 15397831
//Assignment 2
//Assignment 3 : Part 1
package assignment3a;

import java.io.Serializable;

//class to return measurement of each weather station
public class Measurement implements Serializable{
    private int time;
    private Double temperature;
    //constructor with time and duble parameters for measurement
    public Measurement(int time, Double temperature){
        this.time = time;
        this.temperature = temperature;
    }

    public void setTime(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }
    //returns to string value so its viewable on print output
    @Override
    public String toString() {
        return this.getTime() + " " + this.getTemperature();
    }
}
