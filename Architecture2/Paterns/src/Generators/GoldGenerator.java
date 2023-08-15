package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
