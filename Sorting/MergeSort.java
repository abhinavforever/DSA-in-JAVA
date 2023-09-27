package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int arr[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1, n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 40, 20, 30};
        int low = 0, high = a.length - 1;
        mergeSort(a, low, high);
        System.out.println(Arrays.toString(a));
    }
}

