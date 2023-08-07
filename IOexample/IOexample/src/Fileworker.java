import java.io.*;
import java.util.Random;

//  * 1.Создать  2 текстовых файла, примерно по 50-100 символов в каждом.
// * 2.Написать метод, "склеивающий" эти файлы, то есть идет текст первого потом второго.
//* 3.Написать метод, который проверяет, присутсвует ли указаное пользователем слово в файле.
//* 4.написать метод, проверяющий, есть ли указаное слово в папке.
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
    //1. Написать функцию, создающую резервную копию всех
    //файлов в директории(без поддиректорий) во вновь созданную папку ./backup
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

                   try (FileOutputStream fileOutputStream = new FileOutputStream(dir+"/back/"+f.getName())){

                       fileOutputStream.write(sb.toString().getBytes());
                       fileOutputStream.close();
                   }
                }
            }
        }



    }
}
