import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorLap {
    List<String> names = new ArrayList<>();

    List<String> color = new ArrayList<>();
    List<String> OS = new ArrayList<>();
    List<Integer> ram = new ArrayList<>();
    List<Integer> memory = new ArrayList<>();

    List<Laptop> laptops;

    GeneratorLap() {
        names.add("ASUS");
        names.add("ACER");
        names.add("HQ");
        names.add("Dell");
        names.add("Corsair");
        names.add("Fujitsu");

        color.add("red");
        color.add("black");
        color.add("green");
        color.add("black");
        color.add("yellow");
        color.add("pink");
        color.add("gray");
        color.add("white");

        OS.add("Linux");
        OS.add("Windows");

        ram.add(512);
        ram.add(1024);
        ram.add(2048);
        ram.add(4096);
        ram.add(8112);
        ram.add(16224);

        memory.add(512);
        memory.add(1024);
        memory.add(2048);
        memory.add(4096);
        memory.add(8112);
        memory.add(16224);
    }

    Laptop addOnesToGenerator(String name, String color, String OS, int ram, int memory) {
        return new Laptop(name, color, OS, ram, memory);
    }

    List<Laptop> addSeveralLap(int countLaptops) {
        this.laptops = new ArrayList<Laptop>();
        for (int i = 0; i < countLaptops; i++) {
            laptops.add(addOnesToGenerator(randomString(this.names), randomString(color), randomString(OS), randomValues(ram), randomValues(memory)));
        }


        return laptops;
    }

    String randomString(List<String> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size() - 1));

    }

    int randomValues(List<Integer> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size() - 1));
    }
}
