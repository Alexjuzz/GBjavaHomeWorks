import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    List<String> str = new LinkedList<>();
    str.add("Hello");
    str.add("World");
    str.add("!");
    System.out.println(reverse_link_list(str));
    }

    static List<String> reverse_link_list(List<String> list) {
        List<String> stringList = new LinkedList<>();
        for (int i = list.size()-1; i >= 0  ; i--) {
            stringList.add(list.get(i));
        }
        return stringList;
    }
}

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */