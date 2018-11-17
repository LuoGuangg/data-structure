package com.guang;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang
 * @Description:
 * @date: 2018/11/17 14:10
 */
public class Main {

    public static void main(String[] args){

        int [] scoreArr = {1,3,4,5,6,7,8,9,10};

        int key = 3;

        int index = binarySearch(scoreArr, key);
        System.out.println(index);
    }
    /**
     * @author：LuoGuang
     * @Description： 普通方法
     * @Date：14:20 2018/11/17
     * @params:
     * @param scoreArr
     * @param key
     */
//    private static int binarySearch(int[] scoreArr, int key) {
//
//        int lnum = 0;
//        int rnum = scoreArr.length - 1;
//
//        while (lnum <= rnum){
//            int mid = (lnum + rnum) / 2;
//            if (scoreArr[mid] == key){
//                return mid;
//            }else if(scoreArr[mid] > key){
//                rnum = mid - 1;
//            }else{
//                lnum = mid + 1;
//            }
//        }
//        return -1;
//    }

    /**
     * @author：LuoGuang
     * @Description： 递归
     * @Date：14:20 2018/11/17
     * @params:
     * @param scoreArr
     * @param key
     */
    private static int binarySearch(int[] scoreArr, int key) {
        int lnum = 0;
        int rnum = scoreArr.length - 1;

        return binarySearch(scoreArr,key,lnum,rnum);
    }

    private static int binarySearch(int[] scoreArr, int key, int lnum, int rnum) {
        if (lnum > rnum){
            return -1;
        }
        int mid = (lnum + rnum) / 2;

        if (scoreArr[mid] == key){
            return mid;
        }else if(scoreArr[mid] > key){
            rnum = mid - 1;
        }else{
            lnum = mid + 1;
        }

        return binarySearch(scoreArr,key,lnum,rnum);
    }
}
