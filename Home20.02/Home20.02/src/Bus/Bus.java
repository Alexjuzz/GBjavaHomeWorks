package Bus;

import Autos.Auto;
import Transoport.Transport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Bus extends Auto {
    private final String brand;
    int index = 6;
    private final int countseat;
    private final double price;
    private final String color;
    public final  static List<Bus> busList = new ArrayList<>();
    public Bus(String vin, String type, String color,double price, int countseat, String brand) {
        super(vin, type, color,price,countseat);
        this.countseat = countseat;
        this.brand = brand;
        this.color = color;
        this.price = price;
        addObj();
    }
    // ---------------------------------------------------------------------------------------------------------
    // Метод TOSTRING
    @Override
    public String toString() {
        return "Car{" +
                "brand = " + brand + '\'' +
                ", maxSpeed = " + color +
                ", VIN = " + getVin() + " " +
                "Цена  = " + getPrice() +

                '}';
    }
    // ---------------------------------------------------------------------------------------------------------

    // РЕАЛИЗАЦИЯ МЕТОДА ИНТЕРФЕЙСА CountsObjects ДЛЯ ДОБАВЛЕНИЯ В СТАТИЧНЫЙ ЛИС

    @Override
    public void addObj() {
        busList.add(this);
    }
    // ---------------------------------------------------------------------------------------------------------
    // Методы hasNEXT и NEXT для вывода данных из обьекта
    @Override
    public boolean hasNext() {
        return this.index-- >= 0;
    }

    @Override
    public String next() {
        return switch (index) {
            case (0) -> String.format("Brand: %s", this.brand);
            case (1) -> String.format("Brand: %s", this.getVin());
            case (2) -> String.format("Brand: %s", this.getType());
            case (3) -> String.format("Brand: %s", this.countseat);
            case (4) -> String.format("Brand: %s", this.price);
            case (5) -> String.format("Brand: %s", this.color);
            default -> null;
        };

    }


    public String getBrand() {
        return brand;
    }

    public int getIndex() {
        return index;
    }

    public int getCountseat() {
        return countseat;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // ---------------------------------------------------------------------------------------------------------
    // для работы с FOREACH
    public Iterator<Transport> iterator() {
        Iterator<Transport> it = new Iterator<Transport>() {
            private int index1 = 0;
            @Override
            public boolean hasNext() {
                return index1 < busList.size();
            }

            @Override
            public Transport next() {
                return busList.get(index1);
            }
        };
        return it;
    }
    // ---------------------------------------------------------------------------------------------------------
    // КОМПОРАТОР ДЛЯ СРАВНЕНИЯ
    @Override
    public int compareTo(Transport o) {
      return Double.compare(this.price,o.getPrice());
    }
}

