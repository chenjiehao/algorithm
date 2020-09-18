package com.bilusi.algorithm.leetcode;

import java.util.Stack;

/**
 * @program: algorithm
 * @description: leetcode 20题 判断是否有效的括号
 * @author: bilusi
 * @create: 2020-09-18 15:58
 **/
public class Code20 {
    public static void main(String[] args) {
        /**
         * 主要的思路是通过stack来实现的。
         */
        String str="((({{[[]]}})))";
        if (isCompliance(str)) {
            System.out.println("合规");
        }else
            System.out.println("不合规");
    }


    public static boolean isCompliance(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if(c==')'&&pop!='('){
                    return false;
                }

                if(c==']'&&pop!='['){
                    return false;
                }

                if(c=='}'&&pop!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
