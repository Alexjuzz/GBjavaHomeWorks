import Generators.*;
import InterfaceGenerator.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<ItemGenerator> ItemList= new ArrayList<>();
        ItemList.add(new GoldGenerator());
        ItemList.add(new GemGenerator());
        ItemList.add(new IronGenerator());
        ItemList.add(new SilverGenerator());
        ItemList.add(new StoneGenerator());
        ItemList.add(new GlassGenerator());
        ItemList.get(1).openReward();
        for (int i = 0; i < 21; i++) {
            int item = Math.abs(random.nextInt(0,5));
            ItemGenerator itemGenerator = ItemList.get(item);
            itemGenerator.openReward();
        }

    }
}