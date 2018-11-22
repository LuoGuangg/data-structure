package com.guang;

import java.util.Arrays;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/20 14:07
 */
public class Main {

    public static void main(String[] args){

        int [] arr = {3,1,512,6,34,723,567,23,456,12,345,123,21,423,36,657,123,27};

        Sort quickSort = new BubbeSort();
        quickSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
