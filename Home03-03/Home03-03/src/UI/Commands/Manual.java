package UI.Commands;

import UI.view.Console;
import UI.view.Options;

public class Manual implements Options {


    @Override
    public void execute() {

    }

    @Override
    public String discription() {
        return "Выполнился МАНУАЛ";
    }

    @Override
    public String toString() {
        return "Manual menu";
    }
}
