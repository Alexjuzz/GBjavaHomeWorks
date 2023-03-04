package place;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservoir implements Randomable{
    private final List<String> reservoir;

    public Reservoir(){
        reservoir = new ArrayList<>();
        reservoir.add("lake");
        reservoir.add("river");
        reservoir.add("see");
    }
    @Override
    public String random() {
        return reservoir.get(new Random().nextInt(reservoir.size()));

    }
}
