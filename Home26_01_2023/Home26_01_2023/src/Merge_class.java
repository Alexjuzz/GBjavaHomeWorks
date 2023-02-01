import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Merge_class {
    public static void main(String[] args) {

        Random random = new Random();

        int[] values = new int[random.nextInt(444)];
        for (int  i = 0;  i < values.length;  i++) {
            values[i] = random.nextInt(100);
        }
        System.out.println(values.length);
        System.out.println(Arrays.toString(values));
        int[] values2 = {1, 4, 8, 9};
        test_sort(values,values.length);
        int [] hz = test_sort(values,values.length);
        System.out.println(Arrays.toString(hz));
    }

    static int[] merge_val(int a[],int[] val1, int[] val2,int ind1,int ind2) {
        int i = 0;
        int index_val1 = 0;
        int index_val2 = 0;

        while (index_val1  < ind1 && index_val2  < ind2){
            if (val1[index_val1] > val2[index_val2]){
                a[i++] = val2[index_val2++];
            }else {
                a[i++] = val1[index_val1++];
            }
        }
        while (index_val1 < ind1){
            a[i++] = val1[index_val1++];
        }

        while (index_val2 < ind2){
            a[i++] = val2[index_val2++];
        }
            return  a;
    }
        static  int[] test_sort(int [] array, int size){
            if (size == 1){
                return  array;
            }
            int mid = size - size /2;
            int start = size/2;

            int [] array1 = new int[start];
            int [] array2= new int[mid];
           for (int i = 0;i < start;i++){
               array1[i] = array[i];
           }
           for (int i = start;i  < size;i ++){
               array2[i-start] = array[i];

           }
           test_sort(array1,start);
           test_sort(array2,mid);
            merge_val(array,array1,array2,start,mid);
            return array;
        }

}