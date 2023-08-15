package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.IronReward;

public class IronGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new IronReward();
    }
}
