import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linker_list {

     List<String> reverse_link_list(List<String> list) {
        List<String> stringList = new LinkedList<>();
        for (int i = list.size()-1; i >= 0  ; i--) {
            stringList.add(list.get(i));
        }
        return stringList;
    }
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
