package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.SilverReward;

public class SilverGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new SilverReward();
    }
}
