import java.util.List;

public class Main {
    public static void main(String[] args) {
      GeneratorLap generatorLap = new GeneratorLap();
      List<Laptop> laptopList = generatorLap.addSeveralLap(6);
      FindLap findLap = new FindLap();
        for (Laptop lp: laptopList
        ) {
            System.out.println(lp);
        }
      List<Laptop> ll = findLap.findval(laptopList);
        System.out.println(ll.size());
        for (Laptop lp: ll
             ) {
            System.out.println(lp);
        }
    }
}
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */