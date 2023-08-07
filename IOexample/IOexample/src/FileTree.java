import java.io.File;

public class FileTree {

    /**
     * Отрисовка директории с файлами
     * @param file - путь  откуда будет описано дерево с файлами.
     * @param indent - стартовый сивол корневой дерриктории.
     * @param isLast - является ли папка конечной.
     */
    public static void printTree(File file, String indent, boolean isLast,boolean fileOn){

        System.out.print(indent);
        if(isLast){
            System.out.print("└─");
            indent += "  ";
        }else{
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());
        File [] files = file.listFiles();
        int subdirTotal = 0;

        for (File value : files) {
            if (value.isDirectory()) {
                subdirTotal++;
            } else {
                if(fileOn)
                System.out.println(printFiles(indent, value.getName()));
            }
        }
        int subdircounter = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                subdircounter++;
                printTree(value, indent, subdircounter == subdirTotal,fileOn);
            }
        }
    }

    /**
     * Вспомогательный метод для отрисовки файлов в дереве.
     * @param indent - символ текущий.
     * @param name - имя файла.
     * @return - результирующая строка.
     */
    public static String printFiles(String indent, String name){
       return indent + "|" +  " ─>" + name;
    }


}
