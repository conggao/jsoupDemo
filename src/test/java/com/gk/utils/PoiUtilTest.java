package com.gk.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pc on 2017/3/8.
 */
public class PoiUtilTest {
    XSSFWorkbook xb;
    XWPFDocument xd;
    XWPFDocument workXd;

    @Before
    public void before(){
        try {
            xb = new XSSFWorkbook(new FileInputStream("D:\\MyIJ\\jsoupDemo\\src\\test\\resources\\hello.xlsx"));
            xd = new XWPFDocument(new FileInputStream("D:\\MyIJ\\jsoupDemo\\src\\test\\resources\\hello.docx"));
            workXd = new XWPFDocument(new FileInputStream("D:\\jiaxiao\\cepDesigner\\protocol\\图文主协议\\成长档案模块.docx"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testExcel(){
        XSSFSheet sheet = xb.getSheetAt(0);
        XSSFRow row = sheet.getRow(1);
        Iterator<Cell> cellIterator = row.cellIterator();
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            cell.setCellValue("hello");
        }
        try {
            FileOutputStream os= new FileOutputStream("D:\\MyIJ\\jsoupDemo\\src\\test\\resources\\hello.xlsx");
            xb.write(os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testWorld(){

        List<XWPFParagraph> paragraphs = xd.getParagraphs();
        System.out.println(paragraphs.get(0).getText()+"\n");
        System.out.println(paragraphs.get(1).getText());

    }
    @Test
    public void testWorkWorld(){
        List<XWPFParagraph> paragraphs = workXd.getParagraphs();
    }


}