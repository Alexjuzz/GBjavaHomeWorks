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

    /**
     * Генератор случайных символов Aa - Zz.
     * @param sizeString - количество символов.
     * @return - строка с итоговым набором символов.
     */
    private String generateRandomString(int sizeString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sizeString; i++) {
            int x = random.nextInt(CHAR_BOUND_L, CHAR_BOUND_H + 1);
            if (x >= 91 && x <= 97) {
                stringBuilder.append(' ');
            } else stringBuilder.append((char) x);

        }
        return stringBuilder.toString();
    }

    /**
     * Приватный  метод заполнения файла случайными символами.
     * @param filename - Название файла.
     * @param size - колпичество символов.
     * @throws IOException
     */
    private void fileCreatorSymbols(String filename, int size) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            fileOutputStream.write(generateRandomString(size).getBytes());
        }
    }

    /**
     * Метод поиска совпадения строки, если в файле имеется строка совподающая с запросом будет возращего true.
     * @param filename - название файла в котором будет производиться поиск
     * @param searchString - поисковый запрос
     * @return - true - есть совпадение, false - нету
     * @throws IOException
     */
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
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Метод обьединения двух файлов в один.
     * @param File1 - название первого файла(путь)
     * @param File2 - название второго файла(путь)
     * @param ResulFileName - название результируешего файла
     * @throws IOException
     */
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

    /**
     * Метод для создания однотипных файлов с разным набором латинских символов Aa-Zz.
     * @param nameFiles - название файла - "Example"  > Example_1.txt
     * @param countFiles - Числов файлов
     * @param sizeFiles - Количесво символов в файле
     * @throws IOException - искл
     */
    public void generateFiles(String nameFiles, int countFiles, int sizeFiles) throws IOException {
        String[] filenames = new String[countFiles];
        for (int i = 0; i < countFiles; i++) {
            filenames[i] = nameFiles + "_" + i + ".txt";
            fileCreatorSymbols(filenames[i], sizeFiles);
            System.out.printf("File create: %s \n", filenames[i]);


        }
    }


    /**
     * Метод создания копии в отдельную паппку /back в текущей дириктории
     * @param dir - параметр в какой дерриктории сделать backup, будут взяты все файлы указаной дириктории
     * @throws IOException
     */
    public void createBackUp(String dir) throws IOException {
        File file = new File(dir);
        File files[] = file.listFiles();
        File ss = new File(dir + "/back/");
        ss.mkdirs();
        StringBuilder sb = new StringBuilder();
        int i;
        for (File f : files) {
            if (f.isFile()) {
                try (FileInputStream fileInputStream = new FileInputStream(f)) {
                    while ((i = fileInputStream.read()) != -1) {
                        sb.append((char) i);
                    }
                    try (FileOutputStream fileOutputStream = new FileOutputStream(dir + "/back/" + f.getName())) {
                        fileOutputStream.write(sb.toString().getBytes());

                    }
                }
            }
        }


    }
}
