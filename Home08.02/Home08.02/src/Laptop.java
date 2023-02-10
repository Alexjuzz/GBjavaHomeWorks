public class Laptop {
    String name;
    String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    String OS;
    int ram;
    int memory;

    Laptop(String name, String color, String OS, int ram, int memory) {
        setName(name);
        setColor(color);
        setRam(ram);
        setMemory(memory);
        setOS(OS);

    }

    @Override
    public String toString() {
        return String.format("Название: %s - Цвет: %s - Операционная система: %s - Оперативная память: %s - Жесткий диск: %d\n", this.name, this.color, this.OS, this.ram, this.memory);
    }
}
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
