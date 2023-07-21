import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) и фиксированной оплатой (второй потомок).
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
 для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
б) Создать на базе абстрактного класса массив сотрудников и заполнить его.
в) ** Реализовать интерфейсы для возможности сортировки массива (обратите ваше внимание на интерфейсы Comparator, Comparable)
г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
 */
public class Main {
    public static void main(String[] args) {
        vJobovatel person1 = new vJobovatel("Vasya",true,18000);
        vJobovatel person2 = new vJobovatel("Kolya",true,22000);
        vJobovatel person3 = new vJobovatel("Petya",true,18000);
        vJobovatel person4 = new vJobovatel("Marina",true,13000);
        vJobovatel person11 = new vJobovatel("Olya",false,200);
        vJobovatel person12 = new vJobovatel("Sofia",false,210);
        vJobovatel person13 = new vJobovatel("Igor",false,150);
        vJobovatel person14 = new vJobovatel("Alexey",false,360);
        System.out.println(vJobovatel.getListWorkers());
        Collections.sort(vJobovatel.getListWorkers());
        System.out.println(vJobovatel.getListWorkers());

        for (vJobovatel v: vJobovatel.getListWorkers()
             ) {
            System.out.println(v);
        }
        System.out.println( person2.getPayment());
        System.out.println(person13.getPayment());

    }
}