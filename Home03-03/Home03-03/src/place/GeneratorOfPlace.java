package place;

import java.util.ArrayList;
import java.util.List;

public class GeneratorOfPlace {
    List<Randomable> randomables;
    public GeneratorOfPlace() {
        randomables = new ArrayList<>();
        randomables.add(new TimeofDay());
        randomables.add(new Weather());
        randomables.add(new Reservoir());
    }
    public List<String> generator() {
        List<String> result = new ArrayList<>();
        for (Randomable r : randomables
        ) {
            result.add(r.random());
        }
        return result;
    }
}
