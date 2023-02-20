package Autos;

import Transoport.Transport;

public abstract  class Auto extends Transport {
    private final String color;

    private final int countseat;
    private final double price;



    public Auto(String vin, String type, String color, double price, int countseat) {
        super(vin, type);
        this.color = color;

        this.countseat = countseat;
        this.price = price;
    }
}
