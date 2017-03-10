package com.gk.utils;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 2017/3/7.
 */
public class RegexUtilTest {
    @Test
    public void matchTest() {
        String content = "http://192.168.0.99:8080/cep/Main.action";
        String patten = "^(\\w+):\\/\\/([^/:]+)(:\\d*)?([^# ]*)$";
        // System.out.println(Pattern.matches(patten, content));
        Pattern compile = Pattern.compile(patten);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            for (String s : matcher.group(4).split("/")) {
                System.out.println(s);
            }


        } else {
            System.out.println("no found");
        }


    }

}