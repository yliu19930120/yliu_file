package com.yliu.excel;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ExcelOpTest {

    @Test
    public void  test(){
        ExcelWriter excelWriter = ExcelUtil.getWriter("C:\\mysoft\\yliu\\yliu_file\\src\\test\\resources\\actions.xlsx");
        List<String> heders = Arrays.asList("动作名称");
        excelWriter.writeHeadRow(heders);
    }
}
