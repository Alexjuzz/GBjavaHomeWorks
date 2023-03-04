package items;

import items.Fishrod.Fishrod;
import items.Fishrod.FlyWheel;
import items.Fishrod.Spinning;
import items.Fishrod.Telescopic;
import items.Lure.Corn;
import items.Lure.Dough;
import items.Lure.Lure;
import items.Lure.Worms;

import java.util.ArrayList;
import java.util.List;

public class ListItem {
    private final List<Item> itemList;

    public ListItem() {
        itemList = new ArrayList<>();
        itemList.add(new Telescopic("Телескопическая", 20.2, 10, "Обычная"));
        itemList.add(new Spinning("Спининг-2023", 10.2, 50, "Плетеная"));
        itemList.add(new Telescopic("Телескопическая", 15.0, 20, "Флюрокорбон"));
        itemList.add(new FlyWheel("Маховая", 23, 12, "Резинка от трусов"));
        itemList.add(new Spinning("Спининг-1", 25.2, 69, "Плетеновая"));
        itemList.add(new Corn());
        itemList.add(new Dough());
        itemList.add(new Worms());
    }


    public void showFishRods(String text) {
        for (Item f : itemList
        ) {
            if (text.equals("1")) {
                if (f instanceof Fishrod) {
                    System.out.println(f.description());
                }
            } else if (text.equals("2")) {
                if (f instanceof Lure) {
                    System.out.println(f.description());
                }
            }
        }
    }

    public Item getFishRod(int index) {
        index--;
        if (index >= 1 || index < itemList.size() - 1) {
            return itemList.get(index);
        }
        return null;
    }
}

