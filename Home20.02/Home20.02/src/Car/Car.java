package Car;

import Autos.Auto;
//import Bus.Bus;
import Transoport.Transport;

import java.util.*;
import java.util.function.Consumer;

public class Car extends Auto {
    private String brand;
    private int maxSpeed;
    private int countseat;
    int index = 0;
    private String color;
    private double price;

    public final static List<Car> carList = new ArrayList<>();


    // ---------------------------------------------------------------------------------------------------------
//  КОНСТРУКТОР  + ДОБАВЛЕНИЕ В СТАТИЧНЫЙ ЛИС ОБЬЕКТОВ ТИПА КАР
    public Car(String vin, String type, String color, double price, int countseat, String brand, int maxSpeed) {
        super(vin, type, color, price, countseat);
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.price = price;
        if (countseat > 6 || countseat < 1) {
            throw new IllegalArgumentException("Не корректрый ввод данных");
        }
        setCountseat(countseat);
        addObj();

    }
    public void setCountseat(int countseat) {

        this.countseat = countseat;
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
        switch (index) {
            case (0):
                return String.format("Brand: %s", this.brand);

            case (1):
                return String.format("VIN: %s", this.getVin());

            case (2):
                return String.format("Type: %s", this.getType());

            case (3):
                return String.format("Количество мест: %s", this.countseat);

            case (4):
                return String.format("Цена: %s", this.price);

            case (5):
                return String.format("Свет: %s", this.color);

            default:
                return null;
        }
    }


    // ---------------------------------------------------------------------------------------------------------
    // для работы с FOREACH
    @Override
    public Iterator<Transport> iterator() {
        Iterator<Transport> it = new Iterator<Transport>() {
            private int index1 = 0;
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
