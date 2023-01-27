import java.util.*;

public class Main {
    public static void main(String[] args) {

 /*
1 Пусть дан произвольный список целых чисел, удалить из него четные числа
2 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
3 *Реализовать алгоритм сортировки слиянием
 */
        ArrayList<Integer> a = randomGeneric(10);
        System.out.println(a);
//        ArrayList<Integer> b = delAllisEvenValues(a);
//        System.out.println(b);
        ArrayList st = (ArrayList) min_Max_AverageValues(a);
        ArrayList st2 = min_Max_AverageValues2(a);
        System.out.printf(String.valueOf(st));
        System.out.printf(String.valueOf(st2));

    }

    static ArrayList<Integer> randomGeneric(int size) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = size; i > 0; i--) {
            integers.add(new Random().nextInt(100));
        }
        return integers;
    }

    static ArrayList<Integer> delAllisEvenValues(ArrayList<Integer> integers) {
        ArrayList<Integer> resultIntegers = new ArrayList<>();
        for (int num : integers) {
            if (!(num % 2 == 0)) {
                resultIntegers.add(num);
            }
        }
        return resultIntegers;
    }

    static List min_Max_AverageValues(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        List resultValues = new ArrayList();
        int minValue = list.get(0);
        int maxValue = list.get(0);
        double AverageValue;
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (minValue > list.get(i)) {
                minValue = list.get(i);

            }
            if (maxValue < list.get(i)) {
                maxValue = list.get(i);

            }
            summ += list.get(i);

        }
        resultValues.add(maxValue);
        resultValues.add(minValue);
        resultValues.add(AverageValue = (double) summ / list.size());

        return resultValues;
    }

    static ArrayList min_Max_AverageValues2(ArrayList<Integer> list) {
        Integer sum = 0;
        ArrayList resultList = new ArrayList<>();

        if (!list.isEmpty()) {
            for (Integer mark : list) {
                sum += mark;
            }
            resultList.add(Collections.max(list));
            resultList.add(Collections.min(list));
            resultList.add(sum.doubleValue() / list.size());


        }
        return resultList;
    }
}