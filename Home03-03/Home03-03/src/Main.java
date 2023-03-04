import items.Fishrod.Fishrod;
import items.ListItem;
import items.Lure.Corn;
import items.Lure.Lure;
import place.GeneratorOfPlace;
import place.Place;
import place.Weather;

public class Main {
    public static void main(String[] args) {
        GeneratorOfPlace generator = new GeneratorOfPlace();
        Place  o = new Place();
        System.out.println(o.getStrings());
        ListItem ls = new ListItem();
        ls.showFishRods();
        Lure l  = new Corn();
        System.out.println(l.description());


    }
}