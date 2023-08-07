import java.io.File;
import java.io.IOException;

public class Main {

    /**
     * 1.Создать  2 текстовых файла, примерно по 50-100 символов в каждом.
     * 2.Написать метод, "склеивающий" эти файлы, то есть идет текст первого потом второго.
     * 3.Написать метод, который проверяет, присутсвует ли указаное пользователем слово в файле.
     * 4.написать метод, проверяющий, есть ли указаное слово в папке.

        -------- Домашнее задание.
        1. Написать функцию, создающую резервную копию всех
            файлов в директории(без поддиректорий) во вновь созданную папку ./backup
        2. Доработайте класс Tree и метод print который мы разработали на
            семинаре. Ваш метод должен распечатать полноценное дерево директорий и файлов относительно корневой директории.
     */

     public static void main(String[] args) throws IOException {
        Fileworker fileworker = new Fileworker();
        fileworker.searchStringSymbols("1","AE");
        fileworker.generateFiles("example",3,100);
        FileTree.printTree(new File("."),"",true,false  );
        fileworker.createBackUp(".idea");

    }
}