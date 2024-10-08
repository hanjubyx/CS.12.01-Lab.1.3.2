import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    public static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareToIgnoreCase(array[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                T currentItem = list.get(j);
                T minItem = list.get(minIdx);
                if (currentItem instanceof String && minItem instanceof String) {
                    String currentStr = (String) currentItem;
                    String minStr = (String) minItem;
                    if (currentStr.compareToIgnoreCase(minStr) < 0) {
                        minIdx = j;
                    }
                } else {
                    if (currentItem.compareTo(minItem) < 0) {
                        minIdx = j;
                    }
                }
            }
            Collections.swap(list, minIdx, i);
        }
    }
}