package com.gk.utils;

/**
 * Created by pc on 2017/3/7.
 */
public class TUtil {
    public static <T> String getName(T a){
        System.out.println(a.getClass().getName());
        return a.toString();


    }
}
