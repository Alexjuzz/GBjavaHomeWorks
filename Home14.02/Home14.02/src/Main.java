import java.text.DecimalFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ГАЗЕЛЬ", "РЫЖАЯ", 110, 95, 2.0, 10.000, 2020);
        Car car1 = new Car("Ваз2105", "ЧОРНЫЙТАЗ", 110, 95, 5.0, 240.000, 2020);
        Car car2 = new Car("Priora", "White", 110, 95, 9.0, 200.000, 2020);
        race(car2,car1,1000);

    }

    static public void race(Car car1, Car car2, double distance) {

        double CarU1 = car1.acceleration;
        double CarU2 = car2.acceleration;
        long distanceCar1 = 0;
        long distanceCar2 = 0;
        Date date1 = new Date();
        while (distance > distanceCar1 | distance > distanceCar2) {
            Date date2 = new Date();
            long sek = (date2.getTime() - date1.getTime());
            distanceCar1 = (long) (CarU1 * sek/10);

            distanceCar2 = (long )(CarU2 * sek/10);

            System.out.printf("Дистанция пройденая первым авто: %.2f    <- 1\n", (float)distanceCar1 );
            System.out.printf("Дистанция пройденая вторым авто: %.2f  <- 2\n",(float)distanceCar2 );
            if (distanceCar1 >= distance) {
                System.out.println("win1");
                return;
            }
            if (distanceCar2 >= distance) {
                System.out.println("win2");
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

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