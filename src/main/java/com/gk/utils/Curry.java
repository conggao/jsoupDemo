package com.gk.utils;

import java.util.List;

/**
 * Created by pc on 2017/3/8.
 */
interface Curry {
    public List<String> getList();

    default Curry handle(String... param) {
        List<String> paramList = this.getList();
        if (param == null || param.length <= 0) {
            for (String Str : paramList) {
                System.out.println(Str);
            }
            return null;
        } else {

            for (String Str : param) {
                paramList.add(Str);
            }

            return this;
        }
    }
}
