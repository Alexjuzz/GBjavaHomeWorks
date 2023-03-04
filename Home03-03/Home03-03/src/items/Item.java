package items;

public abstract class Item {
    String name;
   public Item(String name){
        this.name = name;
    }
   public String description(String text){
        return name + " " + text;
    }
}
