package com.lgp.sort.util;

/**
 * @AUTHOR lgp
 * @DATE 2018/8/27 17:09
 * @DESCRIPTION
 **/
public class PrintUtil {
    /**
     * 输出相应数组的结果
     *
     * @param array
     */
    public static void printArr(int[] array) {
        for (int value : array) {
            System.out.print(" " + value + " ");
        }
        System.out.println();
    }
}
