package Engines;

public  abstract  class Engine {
    private  String model;
    private double hp;

    private int Capasity;

    public int getCapasity() {
        return Capasity;
    }

    public void setCapasity(int capasity) {
        Capasity = capasity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
