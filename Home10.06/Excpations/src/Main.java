import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isFloat();
    }
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void isFloat(){
        Scanner  scanner = new Scanner(System.in);
        try {
            float number  = Float.parseFloat(scanner.nextLine());
            System.out.println("Вы ввели число "  + number);
        }catch (Exception e){
            System.err.println("Введено не число. Повторите попытку.");
            isFloat();
        }
    }
}