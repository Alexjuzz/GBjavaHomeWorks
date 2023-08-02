//Задача:
//
//        1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//        подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//        ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//        3 В методе main() вызвать полученный метод, обработать возможные исключения
//        MyArraySizeException и MyArrayDataException и вывести результат расчета.


import MyException.MyArrayDataException;
import MyException.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] q = {{"1", "3", "51", "31"},
                {"1", "3", "51", "412"},
                {"1", "3", "51", "412"},
                {"1", "31", "513", "412","312"}};

        System.out.println(resultSumm(q));
    }

    /**
     * Передается массив строк 4х4.
     * @param array - исходный массив строк.
     * @return возращает сумму элементов.
     */
    static int resultSumm(String[][] array) {
        int result = 0;
        if (isValidSize(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (parseToInt(array[i][j])) {
                        result += Integer.parseInt(array[i][j]);
                    } else {
                        throw new MyArrayDataException("Невозможно перевести данный элемент  в число", i, j);
                    }
                }
            }
        }
        return result;
    }

    /**
     * Метод проверки на то что массив размером 4х4.
     * @param array - массив строк.
     * @return true - если размер соответсвует false - если размер отличается от 4.
     */
    static boolean isValidSize(String[][] array) {

        if (array.length == 0) {
            throw new MyArraySizeException("Неверный размер массива ", 0);
        }
        for (String[] strings : array) {
            if (array.length != 4) {
                throw new MyArraySizeException("Неверный размер массива x = ", array.length);
            }
            for (int j = 0; j < strings.length; j++) {
                if (strings.length != 4) {
                    throw new MyArraySizeException("Неверный размер массива y = ", strings.length);
                }
            }
        }
        return true;
    }

    /**
     * Проверка возможности перевода Строки в число.
     * @param s - строка.
     * @return true - если возможно. false - если не возможно.
     */
    static boolean parseToInt(String s) {
        try {
          Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}