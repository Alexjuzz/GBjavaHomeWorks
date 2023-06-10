package UI.Commands;

import UI.view.Console;
import UI.view.Options;

public class Exit implements Options {

    Console console;
    public Exit(Console console){
        this.console = console;
    }

    @Override
    public void execute() {
        System.out.println("выполнил выход");
        console.finish();

    }

    @Override
    public String discription() {
        return "выход";
    }
}
