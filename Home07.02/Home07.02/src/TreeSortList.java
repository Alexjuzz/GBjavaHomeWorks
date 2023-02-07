import java.util.*;

public class TreeSortList {
    private TreeMap<Integer,List<String>> treeMap;


    TreeSortList(){
        this.treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
    }

    TreeMap<Integer, List<String>> sortTree(List<String> list){
        int count = 0;
        for (String st: list
             ) {
            count =0;
            for (String ss : list
                 ) {
                if(ss.equals(st)){
                    count++;
                }
            }
            treeMap.computeIfAbsent(count,k -> new ArrayList<>()).add(st);
        }
        return this.treeMap;
    }
    List<String> createList(String st){
        String s = st.replace(".","");
        String[] rs= s.split(",");

        List<String> strings = new ArrayList<>();
        for (String sts: rs
             ) {
            String a = sts.trim();
            strings.add(a.split(" ")[0]);
        }
        return strings;
    }

}
/*
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
 Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
 Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
 имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */
