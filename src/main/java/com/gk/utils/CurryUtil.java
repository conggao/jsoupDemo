package com.gk.utils;

import java.util.List;

/**
 * Created by pc on 2017/3/8.
 */
public class CurryUtil implements Curry{
    public List<String> paramList = null;

    public CurryUtil(List<String> paramList) {
        this.paramList = paramList;
    }

    @Override
    public List<String> getList() {

        return this.paramList;
    }
}
