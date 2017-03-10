package com.gk.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017/3/8.
 */
public class Currying {


    @Test
    public void main() {
        List<String> paramList = new ArrayList<String>();
        Curry p = new CurryUtil(paramList);
        //延迟计算结果，当参数为空时计算
        p.handle("aa").handle("bb").handle("cc").handle();
        System.out.println("end.....");

        List<String> paramList1 = new ArrayList<String>();
        Curry p1 = new CurryUtil(paramList1);
        p1.handle("dd").handle("ee").handle("ff").handle();
        System.out.println("end.....");
    }
}
