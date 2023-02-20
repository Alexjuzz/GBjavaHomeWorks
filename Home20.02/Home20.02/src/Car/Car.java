package Car;

import Autos.Auto;
import Transoport.Transport;

import java.util.*;

public class Car extends Auto {
    private final String brand;
    private int maxSpeed;
    private int countseat;
    int index = 0;
    private final String color;
    private final double price;

    public final static List<Car> carList = new ArrayList<>();


    // ---------------------------------------------------------------------------------------------------------
//  КОНСТРУКТОР  + ДОБАВЛЕНИЕ В СТАТИЧНЫЙ ЛИС ОБЬЕКТОВ ТИПА КАР
    public Car(String vin, String type, String color, double price, int countseat, String brand, int maxSpeed) {
        super(vin, type, color, price, countseat);
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.countseat = countseat;
        if (countseat > 6 || countseat < 1) {
            throw new IllegalArgumentException("Не корректрый ввод данных");
        }
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

                '}';
    }
    // ---------------------------------------------------------------------------------------------------------

    // РЕАЛИЗАЦИЯ МЕТОДА ИНТЕРФЕЙСА CountsObjects ДЛЯ ДОБАВЛЕНИЯ В СТАТИЧНЫЙ ЛИС
    @Override
    public void addObj() {
        carList.add(this);
    }


    // ---------------------------------------------------------------------------------------------------------

    // Методы hasNEXT и NEXT для вывода данных из обьекта

    public boolean hasNext() {
        return this.index++ < 0;
    }

    @Override
    public String next() {
        return switch (index) {
            case (0) -> String.format("Brand: %s", this.brand);
            case (1) -> String.format("VIN: %s", this.getVin());
            case (2) -> String.format("Type: %s", this.getType());
            case (3) -> String.format("Количество мест: %s", this.countseat);
            case (4) -> String.format("Цена: %s", this.price);
            case (5) -> String.format("Свет: %s", this.color);
            default -> null;
        };
    }


    // ---------------------------------------------------------------------------------------------------------
    // для работы с FOREACH
    @Override
    public Iterator<Transport> iterator() {
        Iterator<Transport> it = new Iterator<Transport>() {
            private final int index1 = 0;
            @Override
            public boolean hasNext() {
                return index1 < carList.size();
            }

            @Override
            public Transport next() {
                return carList.get(index1);
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
