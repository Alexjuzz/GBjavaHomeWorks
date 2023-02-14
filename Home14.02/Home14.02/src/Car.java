import java.util.Objects;

public class Car {
    double acceleration;
    String model;
    String color;
    int maxSpeed;
    int hp;
    double price;
    int year;
    boolean engineStart = false;

    String location = "Home";

    public Car(String model, String color, int maxSpeed, int hp, double price,double acceleration, int year) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.hp = hp;
        this.price = price;
        this.year = year;
        this.acceleration = acceleration;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void engineon() {
        this.engineStart = true;
    }

    public void engineff() {
        this.engineStart = false;
    }

    public String getInfo() {
        return "Авто  -  " +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", hp=" + hp +
                '.';
    }

    public void setLocation(String location) {
        if (this.engineStart) {
            System.out.println(this.location + " текущая локация");
            System.out.println("Отправляемся -> " + location);
            this.location = location;
        } else {
            System.out.println("Двигатель заглушен и мы не можем ехать" );

        }

    }

    @Override
    public boolean equals(Object o) {
        if ((Car) o == this) {
            if (this.model.equals(((Car) o).model) && this.hp == ((Car) o).hp) {
                return true;
            }
        }
        return false;
    }


}
/*
    Доработайте программу в свободном стиле.
        Можно сравнить 2 автомобиля между собой
        Или пусть авто заедет за фруктами :-)
        Добавьте несколько произвольных методов и свойств
<br>
ДОП: Сделать гонки:
        - задаём растояние
        - едут до финиша.
        Сказать кто победит.

<br>
Кто не доделал - задания на семинаре:
        1)
        Напишите класс Car.
        В классе должна храниться следующая информация:
        название автомобиля - model;
        год выпуска - year;
        стоимость - price;
        цвет - color;
        объем двигателя - power.
<br>
2) Доработайте класс Car.
        Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта класса model , power и yeare.
<br>
3) Доработайте класс Car.
        В классе должна храниться следующая информация:
        Свойство - которое говорит заведен авто или нет
        Метод - запуска автомобиля
        Метод - остановки автомобиля
        Метод дороги - при вызове, в качестве аргумента передаем место назначения
        И если авто заведён - выводим, что мы на такой-то авто едем место назначения
        Если не заведён - сообщить, что авто не заведено. И мы не можем ехать

 */