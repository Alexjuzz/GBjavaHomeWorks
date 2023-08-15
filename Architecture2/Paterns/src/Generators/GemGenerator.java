package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
