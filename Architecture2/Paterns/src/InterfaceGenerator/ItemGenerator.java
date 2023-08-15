package InterfaceGenerator;

import Items.GameItem;

public abstract  class ItemGenerator {
    public void openReward(){
        GameItem gameItem =createItem();
        gameItem.open();

    }
    public abstract GameItem createItem();
}
