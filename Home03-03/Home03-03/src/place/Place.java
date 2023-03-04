package place;

import java.util.ArrayList;
import java.util.List;

public class Place {
    public String weatherName;
    GeneratorOfPlace gen;
    public String a;
    private final List<String> strings;
    public List<String> getStrings() {
        return strings;
    }

    public Place() {
        gen = new GeneratorOfPlace();
        strings = gen.generator();
    }

}

