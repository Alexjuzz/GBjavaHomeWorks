import java.io.File;

public class FileTree {

    public static void printTree(File file, String indent, boolean isLast){
        System.out.print(indent);
        if(isLast){
            System.out.print("ââ");
            indent += "  ";
        }else{
            System.out.print("ââ");
            indent += "â ";
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
       return indent + "|" +  " â>" + name;
    }


}
import java.io.*;
import java.util.Random;

//  * 1.Ð¡Ð¾Ð·Ð´Ð°ÑÑ  2 ÑÐµÐºÑÑÐ¾Ð²ÑÑ ÑÐ°Ð¹Ð»Ð°, Ð¿ÑÐ¸Ð¼ÐµÑÐ½Ð¾ Ð¿Ð¾ 50-100 ÑÐ¸Ð¼Ð²Ð¾Ð»Ð¾Ð² Ð² ÐºÐ°Ð¶Ð´Ð¾Ð¼.
// * 2.ÐÐ°Ð¿Ð¸ÑÐ°ÑÑ Ð¼ÐµÑÐ¾Ð´, "ÑÐºÐ»ÐµÐ¸Ð²Ð°ÑÑÐ¸Ð¹" ÑÑÐ¸ ÑÐ°Ð¹Ð»Ñ, ÑÐ¾ ÐµÑÑÑ Ð¸Ð´ÐµÑ ÑÐµÐºÑÑ Ð¿ÐµÑÐ²Ð¾Ð³Ð¾ Ð¿Ð¾ÑÐ¾Ð¼ Ð²ÑÐ¾ÑÐ¾Ð³Ð¾.
//* 3.ÐÐ°Ð¿Ð¸ÑÐ°ÑÑ Ð¼ÐµÑÐ¾Ð´, ÐºÐ¾ÑÐ¾ÑÑÐ¹ Ð¿ÑÐ¾Ð²ÐµÑÑÐµÑ, Ð¿ÑÐ¸ÑÑÑÑÐ²ÑÐµÑ Ð»Ð¸ ÑÐºÐ°Ð·Ð°Ð½Ð¾Ðµ Ð¿Ð¾Ð»ÑÐ·Ð¾Ð²Ð°ÑÐµÐ»ÐµÐ¼ ÑÐ»Ð¾Ð²Ð¾ Ð² ÑÐ°Ð¹Ð»Ðµ.
//* 4.Ð½Ð°Ð¿Ð¸ÑÐ°ÑÑ Ð¼ÐµÑÐ¾Ð´, Ð¿ÑÐ¾Ð²ÐµÑÑÑÑÐ¸Ð¹, ÐµÑÑÑ Ð»Ð¸ ÑÐºÐ°Ð·Ð°Ð½Ð¾Ðµ ÑÐ»Ð¾Ð²Ð¾ Ð² Ð¿Ð°Ð¿ÐºÐµ.
public class Fileworker {
    private final int CHAR_BOUND_L = 65;
    private final int CHAR_BOUND_H = 122;
    private final Random random = new Random();

    public String generateRandomString(int sizeString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sizeString; i++) {
            int x = random.nextInt(CHAR_BOUND_L, CHAR_BOUND_H + 1);
            if (x >= 91 && x <= 97) {
                stringBuilder.append(' ');
            } else stringBuilder.append((char) x);

        }
        return stringBuilder.toString();
    }

    public void fileCreatorSymbols(String filename, int size) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            fileOutputStream.write(generateRandomString(size).getBytes());
        }
    }

    public boolean searchStringSymbols(String filename, String searchString) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            int i;
            int counter = 0;
            byte[] searchBytes = searchString.getBytes();
            while ((i = fileInputStream.read()) != -1) {
                if (i == searchBytes[counter]) {
                    counter++;
                } else {
                    counter = 0;
                    if (i == searchBytes[counter]) {
                        counter++;
                    }
                    continue;
                }
                if (counter == searchString.length()) {
                    System.out.println("nice");
                    return true;
                }
            }
        }
        return false;
    }

    public void fileConcatonation(String File1, String File2, String ResulFileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(File1)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }
            stringBuilder.append(". ");
        }
        try (FileInputStream fileInputStream = new FileInputStream(File2)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(ResulFileName)) {
            fileOutputStream.write(stringBuilder.toString().getBytes());
        }
    }

    public void generateFiles(String nameFiles,int countFiles,int sizeFiles) throws IOException {
        String [] filenames =  new String[countFiles];
        for (int i = 0; i < countFiles; i++) {
            filenames[i]  =nameFiles + "_" + i + ".txt";
           fileCreatorSymbols(filenames[i],sizeFiles);
            System.out.printf("File create: %s \n",filenames[i]);


        }
    }
    //1. ÐÐ°Ð¿Ð¸ÑÐ°ÑÑ ÑÑÐ½ÐºÑÐ¸Ñ, ÑÐ¾Ð·Ð´Ð°ÑÑÑÑ ÑÐµÐ·ÐµÑÐ²Ð½ÑÑ ÐºÐ¾Ð¿Ð¸Ñ Ð²ÑÐµÑ
    //ÑÐ°Ð¹Ð»Ð¾Ð² Ð² Ð´Ð¸ÑÐµÐºÑÐ¾ÑÐ¸Ð¸(Ð±ÐµÐ· Ð¿Ð¾Ð´Ð´Ð¸ÑÐµÐºÑÐ¾ÑÐ¸Ð¹) Ð²Ð¾ Ð²Ð½Ð¾Ð²Ñ ÑÐ¾Ð·Ð´Ð°Ð½Ð½ÑÑ Ð¿Ð°Ð¿ÐºÑ ./backup
    public void createBackUp(String dir) throws IOException {
        File file = new File(dir);
        File files[] = file.listFiles();
        File ss = new File(dir + "/back/");
        ss.mkdirs();
        StringBuilder sb = new StringBuilder();
        int i;
        for (File f: files ) {
            if(f.isFile()){
                try (FileInputStream fileInputStream = new FileInputStream(f)) {
                    while ((i = fileInputStream.read()) != -1){
                        sb.append((char)i);
                    }

                   try (FileOutputStream fileOutputStream = new FileOutputStream(f.getName())){

                       fileOutputStream.write(sb.toString().getBytes());
                       fileOutputStream.close();
                   }
                }
            }
        }



    }
}
