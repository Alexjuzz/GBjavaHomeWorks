package UI.view;

import UI.Menu.Menu;

import java.util.Scanner;

public class Console implements view{

    Scanner scanner;
    boolean start = false;
    Menu menu;


    @Override
    public void start() {
        start = true;
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        hello();

        while (start){
            int i = scanner.nextInt();
            getMenu(i);
        }
    }
    public void finish(){
        start = false;
    }
    void prints(String text){
        System.out.println(text);
    }
    public void hello(){
        System.out.println( menu.printMenu());
    }
    public void getMenu(int i){
        menu.getMenu(i);
    }
}
