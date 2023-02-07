import java.util.*;

public class Linker_list {
    int capacity;
    int [] ints;
    String [] strings;
    char [] chars;
    String type;

    Linker_list(String type,int capacity){
        this.capacity = capacity;
            switch (type){
                case ("String") :
                    this.strings = new String[capacity];
                    break;
                case ("int") :
                     this.ints = new int[capacity];
                    break;
                case ("char") :
                    this.chars = new char[capacity];
                    break;

                default:
                    System.out.println("Неверный тип обьекта");
            }
    }

    String [] add(){


    }

//     List<String> reverse_link_list(List<String> list) {
//        List<String> stringList = new LinkedList<>();
//        for (int i = list.size()-1; i >= 0  ; i--) {
//            stringList.add(list.get(i));
//        }
//        return stringList;
//    }
     void enqueue(List<String> list,String str){
        if (list.isEmpty()){
            System.out.println("Пусто");
        } else if (str.length() == 0) {
            System.out.println("Пустая строка");
        }else {
            list.add(list.size(),str);
        }
    }
     String dequeue(List<String> list){
        if(list.isEmpty()){
            System.out.println("Пустой список");
            return null;
        }
        String firstString = list.get(0);
        list.remove(0);

        return  firstString;
    }
    String first_String_in_linkList(List<String> list){
        if(list.isEmpty()){
            System.out.println("Пустой список");
            return null;
        }
        return list.get(0);
    }

     Double summ_linkList(List<Double> list){
        Double summ = 0D;
        ListIterator<Double> iterator = list.listIterator();
        while (iterator.hasNext()){
            summ+= iterator.next();
        }
        return  summ;
    }

}
