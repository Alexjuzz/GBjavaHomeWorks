package UI.Commands;

import UI.view.Console;
import UI.view.Options;

public abstract class Commands implements Options {
    Console console;
    public Commands (Console console){
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }


}
