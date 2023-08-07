import java.io.File;

public class FileTree {

    public static void printTree(File file, String indent, boolean isLast){
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
                System.out.println(printFiles(indent, value.getName()));
            }
        }
        int subdircounter = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                subdircounter++;
                printTree(value, indent, subdircounter == subdirTotal);
            }
        }
    }
    public static String printFiles(String indent, String name){
       return indent + "|" +  " ─>" + name;
    }


}
