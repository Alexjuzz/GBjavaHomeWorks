import java.util.*;

public class FindLap {
    GeneratorLap lap = new GeneratorLap();
    List<Laptop> findval(List<Laptop> list) {
        Object[] array = new Object[5];
        List<Laptop> lst = new ArrayList<>(list);
        List<Laptop> resListr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            try {
                System.out.println("Выберите параметр: " + "1) Фирма. 2)Цвет. 3)Операционная система 4)Оперативная память 5)Память 6)Выйти из поиска 7)Искать");
                int val = scanner.nextInt();
                switch (val) {
                    case (1):
                        if (array[0] == null) {
                            System.out.println();
                            count++;
                            System.out.println(lap.names.toString());
                            System.out.println("Выбери модель 1-5");
                            int model = scanner.nextInt() - 1;
                            System.out.println(lap.names.get(model));
                            for (Laptop lp : lst
                            ) {
                                if (lp.name.equals(lap.names.get(model))) {
                                    resListr.add(lp);
                                }
                            }
                            lst.clear();
                            lst.addAll(resListr);
                            resListr.clear();
                            array[0] = lap.names.get(model);
                        }
                        break;
                    case (2):
                        if (array[1] == null) {
                            count++;
                            System.out.println(lap.color.toString());
                            System.out.println("Выбери Цвет 1-7");
                            int getindex = scanner.nextInt() - 1;
                            System.out.println(lap.color.get(getindex));
                            for (Laptop lp : lst
                            ) {
                                if (lp.color.equals(lap.color.get(getindex))) {
                                    resListr.add(lp);
                                }
                            }
                            lst.clear();
                            lst.addAll(resListr);
                            resListr.clear();
                            array[1] = lap.color.get(getindex);
                        }
                        break;
                    case (3):
                        if (array[2] == null) {
                            count++;
                            System.out.println(lap.OS.toString());
                            System.out.println("Операционная систему 1-2");
                            int os = scanner.nextInt() - 1;
                            System.out.println(lap.OS.get(os));
                            for (Laptop lp : lst
                            ) {
                                if (lp.OS.equals(lap.OS.get(os))) {
                                    resListr.add(lp);
                                }
                            }
                            lst.clear();
                            lst.addAll(resListr);
                            resListr.clear();
                            array[2] = lap.OS.get(os);
                        }
                        break;
                    case (4):
                        if (array[3] == null) {
                            count++;
                            System.out.println(lap.ram.toString());
                            System.out.println("Выбери Обьем RAM 1-6");
                            int ram = scanner.nextInt() - 1;
                            System.out.println(lap.ram.get(ram));
                            for (Laptop lp : lst
                            ) {
                                if (lp.ram == lap.ram.get(ram)) {
                                    resListr.add(lp);
                                }
                            }
                            lst.clear();
                            lst.addAll(resListr);
                            resListr.clear();
                            array[3] = lap.ram.get(ram);
                        }
                        break;
                    case (5):
                        if (array[4] == null) {
                            count++;
                            System.out.println(lap.memory.toString());
                            System.out.println("Выбери Обьем HDD  1-6");
                            int memory = scanner.nextInt() - 1;
                            System.out.println(lap.memory.get(memory));
                            for (Laptop lp : lst
                            ) {
                                if (lp.memory == lap.memory.get(memory)) {
                                    resListr.add(lp);
                                }
                            }
                            lst.clear();
                            lst.addAll(resListr);
                            resListr.clear();
                            array[4] = lap.memory.get(memory);
                        }
                        break;
                    case (6):
                        break;
                    case (7):
                        return lst;
                }
            } catch (Exception exception) {
                exception.getStackTrace();
            }
        }
        return lst;
    }
}
