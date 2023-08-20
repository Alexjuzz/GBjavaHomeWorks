package Cars;

import Engines.Engine;
import Gears.Gear;

import java.awt.*;

public abstract class Car {
    private String model;
    private Color color;
    private int numberWheels;
    private Engine typeEngine;
    private Gear typeGear;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public Engine getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(Engine typeEngine) {
        this.typeEngine = typeEngine;
    }

    public Gear getTypeGear() {
        return typeGear;
    }

    public void setTypeGear(Gear typeGear) {
        this.typeGear = typeGear;
    }
    public  void moveMent(){
    }
    public boolean switchLight(){
        return false;
    }
}
