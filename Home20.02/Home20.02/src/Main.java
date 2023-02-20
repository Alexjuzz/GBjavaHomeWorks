import Bus.Bus;
import Car.Car;
import Transoport.Transport;

import javax.crypto.spec.PSource;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Car Carx = new Car("12fQE32321w3","Внедорожниk","РЕД",3120,5,"UAZ",200);
        Car Car2 = new Car("vetQE32d1w33","Внедорожниk","БЛУ",3120,5,"UAZ",200);
        Car Car3 = new Car("vvawQE3s21w31","Внедорожниk","ГРИН",3120,5,"UAZ",200);
        Car Car4 = new Car("312tbQE3b21w361","Внедорожниk","ВаЙНТ",3120,5,"UAZ",200);
        Bus  bus = new Bus("awdawza1","Komer","blue",103,20,"daewo");
        Bus bus2 = new Bus("q23c11","Komer","black",101,20,"daewo");
        Bus bus3 = new Bus("qadcawdz","Komer","orange",105,20,"daewo");

        // Проверка Вывода списков трансопрта и работы hasnext
//        System.out.println(Transport.transportList);
//        System.out.println(Transport.mapOb);
//        while (Carx.hasNext()){
//            System.out.println(Carx.next());
//        }

        /// ПРОВЕРКА РАБОТЫ ФОРЕАЧ
//        for (Transport b : Bus.busList
//             ) {
//            System.out.println(b);
//        }

        /// ПРОВЕРКА СОРТИРОВКИ
        System.out.println(Bus.busList);
        Collections.sort(Bus.busList);
        System.out.println(Bus.busList);

    }





}
/*
Создать иерархию родительский и дочернии классы для Транспорта
Например Транспорт - > Автомобиль - > Автобус
Транспорт - > Автомобиль - > Легковой
Используем наследование, инкапсуляцию
 */