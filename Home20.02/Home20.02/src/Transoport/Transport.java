package Transoport;

import java.util.*;

public abstract class Transport implements CountsObjects,Iterator<String>,Iterable<Transport>,Comparable<Transport> {
    private String vin;
    private String type;

    private double price;

    public double getPrice() {
        return price;
    }

    public  static List<Transport> transportList = new ArrayList<>();
    public static final  Map<String, String> mapOb = new HashMap<>();

    public Transport(String vin, String type) {
        this.vin = vin;
        this.type = type;
        addObj(this);

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void addObj(Transport tr) {
        mapOb.put("VIN - " + tr.getVin()+ " ",  " КЛАСС " +tr.getClass().getName().substring(4));
        transportList.add(tr);
    }

}
