import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Telbook tb = new Telbook();
        tb.addtobook("Serg", 5125);
        tb.addtobook("Ivan", 5123);
        tb.addtobook("Ivan", 5126);
        tb.addtobook("petya", 51271);
        tb.addtobook("petya", 512662);
        tb.addtobook("petz", +84214);
        tb.addtobook("kolya", "+7941-244-21-11");
        System.out.println(tb);
        tb.removeTelInBook("Ivan", 5126);
        tb.removeTelInBook("petz", +84214);
        System.out.println(tb);
        String st = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин," +
                " Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина," +
                " Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
        TreeSortList treeSortList = new TreeSortList();

        for (Map.Entry<Integer, List<String>> entry : treeSortList.sortTree(treeSortList.createList(st)).entrySet()){
            System.out.println(entry.getKey() + " > " + entry.getValue());

        }

    }


}

/*
1 - Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
2 - Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
 Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
 Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
 имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.





*Реализовать алгоритм пирамидальной сортировки (HeapSort)
**На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */