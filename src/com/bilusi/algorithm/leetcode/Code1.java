package com.bilusi.algorithm.leetcode;

import java.util.HashMap;

/**
 * @program: algorithm
 * @description: 两数之和
 * @author: bilusi
 * @create: 2020-09-18 16:04
 **/
public class Code1 {
    public static void main(String[] args) {
        /**
         * 给定一个数组，给定一个目标值。求两数之和为目标的值的下表
         *
         * 1：大于目标值的排除
         * 2：计算方式的转换，用目标值减去小于目标值，结果是否存在数据中。
         * 3: 数据只能只用一次（不会出现重复）
         */
        int[] ints = new int[3];
        ints[0]=3;
        ints[1]=2;
        ints[2]=4;


        for (int i : towSum(ints, 6)) {
            System.out.println(i);
        }
    }

    public static int[] towSum(int[] array,int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i],i);
        }

        for (int i = 0; i < array.length; i++) {
            int result=target - array[i];
            if(hashMap.containsKey(result)&&hashMap.get(result)!=i){
                return new int[]{i,hashMap.get(result)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
