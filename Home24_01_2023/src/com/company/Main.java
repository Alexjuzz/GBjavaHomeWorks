package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

parseArrayList(readFile("filename.txt"));
    }

    static void parseArrayList(ArrayList<String> arrayList){  // Метод обработки JSON строк  формата :
                                                              // -> {\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}

      try {
          String[] arrayStBuld = new String[arrayList.size()]; // Создание Массива строк размером принятого листа
          int count = 0;
          for (String st : arrayList                           // Перебераем лист
          ) {
              // Избавляемся от ненужных нам элементов в строке путем их замены. И добовляем их в массив строк.
              arrayStBuld[count] = (st.replace("{", "").replace("}", "").replace("\"", "").replace("\\", "").replace("фамилия", "").replace(":", "").replace("оценка", "").replace("предмет", ""));
              count++;
          }
              // Перебираем полученые строки и сплитим по символу ","  во временный массив для вывода нужного результата.
          for (String sts : arrayStBuld
          ) {
              String[] a = sts.split(",");
              System.out.println("Студент " + a[0] + " получил " + a[1] + " по предмету " + a[2]);
              writerFile("Студент " + a[0] + " получил " + a[1] + " по предмету " + a[2],"WriteTest"); // Производим запись в нужный нам файл
          }
      }catch (Exception exception){
          System.out.println("Возникла ошибка при обработе запроса");
      }
    }

    static  ArrayList<String> readFile(String path){ // Метод для считывания из файла строк, возращается ArrayList в качестве результата.
        ArrayList arrayLines = new ArrayList();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                arrayLines.add(line);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return arrayLines;
    }


    static void writerFile(String st,String nameFile){      // Метод для записи в файл
        Writer writer = null;
        String writeString = st;
        try {
            writer  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile,true), "utf-8"));
            writer.write(writeString);
            writer.write("\n");
        }catch (IOException exception){
            exception.printStackTrace();
        }finally {try {
            writer.close();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        }
    }
}


/*
1Дана json строка {
                    { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
                    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
                    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
                   }


 Задача написать метод(ы), который распарсить строку
 и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика. Студент Петрова получил 4 по предмету Информатика.
  Студент Краснов получил 5 по предмету Физика. Используйте StringBuilder для подготовки ответа

 2 Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл

 3  *Получить исходную json строку из файла, используя FileReader или Scanner

 4 *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
 */