import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Linker_list lk = new Linker_list();
    List<String> str = new LinkedList<>();
    str.add("Hello");
    str.add("World");
    str.add("!");
    System.out.println(lk.reverse_link_list(str));
    lk.enqueue(str,"a");
        System.out.println(str);


        System.out.println(str);
        lk.dequeue(str);
        System.out.println(str);


        System.out.println(str);
        System.out.println(lk.first_String_in_linkList(str));

        List<Double> doubles = new LinkedList<>();
        doubles.add(2.1);
        doubles.add(1.0);
        doubles.add(2.14124);
        doubles.add(6.1);
        doubles.add(8.71);
        doubles.add(5.0);
        System.out.println(lk.summ_linkList(doubles));
    }


//
//    static List<String> reverse_link_list(List<String> list) {
//        List<String> stringList = new LinkedList<>();
//        for (int i = list.size()-1; i >= 0  ; i--) {
//            stringList.add(list.get(i));
//        }
//        return stringList;
//    }
//    static void enqueue(List<String> list,String str){
//        if (list.isEmpty()){
//            System.out.println("Пусто");
//        } else if (str.length() == 0) {
//            System.out.println("Пустая строка");
//        }else {
//            list.add(list.size(),str);
//        }
//    }
//    static String dequeue(List<String> list){
//        if(list.isEmpty()){
//            System.out.println("Пустой список");
//            return null;
//        }
//        String firstString = list.get(0);
//        list.remove(0);
//
//        return  firstString;
//    }
//    static String first_String_in_linkList(List<String> list){
//        if(list.isEmpty()){
//            System.out.println("Пустой список");
//            return null;
//        }
//        return list.get(0);
//    }
//
//    static Double summ_linkList(List<Double> list){
//        Double summ = 0D;
//        ListIterator<Double> iterator = list.listIterator();
//        while (iterator.hasNext()){
//            summ+= iterator.next();
//        }
//        return  summ;
//    }
//

}

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */