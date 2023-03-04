package items.Lure;

public class Dough extends Lure{
        private final String name = "dough";
    @Override
    public String description() {
        return "Наживка: " + name;
    }
}
