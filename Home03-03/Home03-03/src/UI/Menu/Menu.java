package UI.Menu;

import UI.Commands.ChoiseFishrod;
import UI.Commands.ChoiseLure;
import UI.Commands.Exit;
import UI.Commands.Manual;
import UI.view.Console;
import UI.view.Options;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Options> optionsList;
    Console console;
    public Menu(Console console){
        this.console = console;
        optionsList = new ArrayList<>();
        optionsList.add(new Manual(console));
        optionsList.add(new ChoiseFishrod(console));
        optionsList.add(new ChoiseLure(console));
        optionsList.add(new Exit(console));
    }
}
