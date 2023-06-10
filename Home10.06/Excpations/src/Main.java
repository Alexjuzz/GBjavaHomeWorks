import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   isFloat();
        //isNotEmptyString();
    }
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.
        public static void isFloat () {
            Scanner scanner = new Scanner(System.in);
            try {
                float number = Float.parseFloat(scanner.nextLine());
                System.out.println("Вы ввели число " + number);
            } catch (Exception e) {
                System.err.println("Введено не число. Повторите попытку.");
                isFloat();
            }
        }
   // 3  Разработайте программу, которая выбросит
   // Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя

        public static void isNotEmptyString(){
        Scanner scanner = new Scanner(System.in);
        try{
            String str = scanner.nextLine();
            if(str.isEmpty()){
                throw  new RuntimeException("Невозможно ввести пустую строку");
            }
            System.out.println(str);

        }catch (Exception e ){
            e.printStackTrace();
        }
        }

    }


    /*
    Если необходимо, исправьте данный код (задание 2)
             try {
            int d = 0;
            int intArray [] = new int[]{1,3,51,2,51,7,1,2,1};  // - добавил массив для работы.  -  Возможны ошибки деления на 0
            int intArray2 [] = new int[]{1,3,51,2,51,7,1,2,};                       // - добавил массив для работы.  -     Возможны ошибки обращения к не существуещему индексу.
        //    double catchedRes1 = intArray[8] / d;                               //  для проверки
            double catchedRes1 = intArray2[8] / d;                               // для проверки
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (IndexOutOfBoundsException e){                                   // обработка от индекса
            System.err.println("Обращение к не существующему индексу");
        }
    }

Задание 3

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   }catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   } catch (Throwable ex) {                                                 // Перенесено обработка глобальной ошибки в самый конец,
                                                                            // так как иначе не сработают пред идущие catch's
       System.out.println("Что-то пошло не так...");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */
