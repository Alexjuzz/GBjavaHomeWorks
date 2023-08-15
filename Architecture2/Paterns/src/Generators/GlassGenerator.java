package Generators;

import InterfaceGenerator.ItemGenerator;
import Items.GameItem;
import Items.GlassReward;

public class GlassGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GlassReward();
    }
}
