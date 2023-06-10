package UI.Menu;

import UI.Commands.*;
import UI.view.Console;
import UI.view.Options;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    StartTest startTest;
    List<Options> optionsList;
//    Console console;
    public Menu(Console console){

        optionsList = new ArrayList<>();
        optionsList.add(new Manual());
        optionsList.add(new ChoiseFishrod());
        optionsList.add(new ChoiseLure());
        optionsList.add(new Exit(console));
    }
    public void getMenu(int i){
        optionsList.get(i-1).execute();
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < optionsList.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(optionsList.get(i).discription() +  "\n");
            
        }
        return stringBuilder.toString();
    }
}
