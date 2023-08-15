package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.StoneReward;

public class StoneGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new StoneReward();
    }
}
