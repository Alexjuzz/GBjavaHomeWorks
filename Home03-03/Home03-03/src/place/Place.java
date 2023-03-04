package place;

import java.util.ArrayList;
import java.util.List;

public class Place {
    GeneratorOfPlace gen;
    private final List<String> strings;
    public List<String> getStrings() {
        return strings;
    }
    public Place() {
        gen = new GeneratorOfPlace();
        strings = gen.generator();
    }

}

