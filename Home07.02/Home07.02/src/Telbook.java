import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Telbook {
    private final Map<String, List<Long>> tb;

    Telbook(){
        this.tb  = new HashMap<>();
    }

    void addtobook(String name,Integer number){
        Long numb  = (long) number;
        if (this.tb.containsKey(name)){
           this.tb.get(name).add(numb );
        }else {
            this.tb.computeIfAbsent(name, k -> new LinkedList<>()).add(numb );
        }
    }
    void addtobook(String name,String number){
        try {
            String value =number.substring(1).replace("-","").replace("(","").replace(")","").replace("_","");

            Long numb = Long.parseLong(value);


        if (this.tb.containsKey(name)){
            this.tb.get(name).add(numb);
        }else {
            this.tb.computeIfAbsent(name, k -> new LinkedList<>()).add(numb);
        }
        }catch (Exception exception){
            exception.getStackTrace();
            System.out.println("Введен не корректный номер");
        }
    }


    @Override
    public String toString() {
        return this.tb.toString();
    }
}
