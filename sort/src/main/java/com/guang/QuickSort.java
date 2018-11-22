package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description: 快速排序
 * @date: 2018/11/20 14:08
 */
public class QuickSort implements Sort{


    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high){
            int middle = getMiddle(arr, low, high);
            sort(arr, low, middle - 1);
            sort(arr, middle + 1, high);
        }
    }

    private int getMiddle(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int x = arr[low];

        while (i < j){

            while (arr[j] >= x && i < j){
                j--;
            }
            if (i < j){
                arr[i] = arr[j];
                i++;
            }

            while (arr[i] < x && i < j){
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;
        return i;
    }
}
