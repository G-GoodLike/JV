import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private static void quicksort(Comparable[] comparables, int low, int high) {
        int i = low, j = high;
        Comparable pivot = comparables[low + (high - low) / 2];

        while (i <= j) {
            while (comparables[i].compareTo(pivot) > 0) {
                i++;
            }
            while (comparables[j].compareTo(pivot) < 0) {
                j--;
            }

            if (i <= j) {
                Comparable temp = comparables[i];
                comparables[i] = comparables[j];
                comparables[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(comparables, low, j);
        if (i < high)
            quicksort(comparables, i, high);
    }


    public static void sort(Comparable[] list) {
       quicksort(list,0,list.length - 1);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("О.В.Нечипоренко",3),
                new Student("К.К. Гнар",6),
                new Student("Д.С.Перофф",4),
        };
        sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
