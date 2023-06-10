import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputUserDate {

    public  void UserInputDate(){
        try {
        writeToFileDate(inPutStr());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   private  String[] inPutStr() {
        String resultStr;
        String[] checkArray = null;
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            resultStr = reader.readLine();
            checkArray = resultStr.split(" ");
            if (checkLengthDate(checkArray)) {
                throw new RuntimeException("Данная строка является не валидной. Проверь длинну строки");
            }
            if (!checkBirthdayValid(checkArray)) {
                throw new RuntimeException("Неверный формат даты");
            }
            if(!checkGender(checkArray)){
                throw  new RuntimeException("Указан неверный пол");
            }
            if(!checkNumber(checkArray)){
                throw  new RuntimeException("Указан неверный формат номера");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return checkArray;
    }
    private boolean checkLengthDate(String[] checkStr) {
        return checkStr.length != 6;
    }
   private boolean checkBirthdayValid(String[] checkStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            simpleDateFormat.format(simpleDateFormat.parse(checkStr[3]));
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
   private boolean checkGender(String[] checkStr) {
        if (checkStr[checkStr.length - 1].toLowerCase().charAt(0) == 'f'
                || checkStr[checkStr.length - 1].toLowerCase().charAt(0) == 'm'
                && checkStr[checkStr.length-1].length() ==1) {
            return true;
        } else {
            return false;
        }
    }
    private boolean checkNumber(String[] checkStr){
        try {
             Integer.parseInt(checkStr[checkStr.length-2]);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    private void writeToFileDate(String[] str) throws IOException {
        BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(str[0],true));
        StringBuilder st = new StringBuilder();
        if(checkAllreadyDates(str)) {
            for (int i = 0; i < str.length; i++) {
                st.append(str[i]).append(" ");
            }
            bufferedReader.write(st + "\n");
            bufferedReader.flush();
            bufferedReader.close();
        }else {
            System.err.println("Данный абонент уже находится в списке");
            UserInputDate();
        }
    }

    private boolean checkAllreadyDates(String[] strings) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(strings[0]));
        String line;
        int count;
        while ((line = bufferedReader.readLine())!=null){

                count = 0;
                String[] checkStr = line.split(" ");
                for (int i = 1; i < strings.length; i++) {
                    if (!strings[i].equals(checkStr[i])) {
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    return false;
                }
        }
        bufferedReader.close();
        return true;
    }
}
