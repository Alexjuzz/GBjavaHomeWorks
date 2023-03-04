package place;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weather  implements Randomable {
   private final List<String>  weathers;

    public Weather(){
        weathers = new ArrayList<>();
        weathers.add("Sunny");
        weathers.add("Cloudy");
        weathers.add("rainy");
    }
    @Override
    public String random() {
        return weathers.get(new Random().nextInt(weathers.size()));

    }


}
