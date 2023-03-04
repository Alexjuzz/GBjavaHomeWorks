package items.Fishrod;

import items.Item;

public abstract class Fishrod extends Item {
    String name;
    private double castingDistance;
    private int burden;
    private String fishingLine;

    @Override
    public String description() {
        return "Удочка: " + this.name;
    }

    public Fishrod(String name, double castingDistance, int burden, String fishingLine) {

        this.name = name;
        this.castingDistance = castingDistance;
        this.burden = burden;
        this.fishingLine = fishingLine;


    }


    public double getCastingDistance() {
        return castingDistance;
    }

    public void setCastingDistance(double castingDistance) {
        this.castingDistance = castingDistance;
    }

    public int getBurden() {
        return burden;
    }

    public void setBurden(int burden) {
        this.burden = burden;
    }

    public String getFishingLine() {
        return fishingLine;
    }

    public void setFishingLine(String fishingLine) {
        this.fishingLine = fishingLine;
    }

}
