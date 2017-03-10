package com.gk.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/3/7.
 */
public class TUtilTest {
    @Test
    public void getName() throws Exception {

        Long l =1l;
        TUtil.getName("hello");
        TUtil.getName(l);

    }

}