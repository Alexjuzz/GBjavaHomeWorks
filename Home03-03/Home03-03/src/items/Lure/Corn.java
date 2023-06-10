package items.Lure;

public class Corn extends Lure{
    private final String name = "corn";




    @Override
    public String description() {
        return "Наживка: " + name;
    }
}
