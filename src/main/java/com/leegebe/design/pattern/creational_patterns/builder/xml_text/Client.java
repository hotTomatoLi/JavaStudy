package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 下午1:20
 */
public class Client {

    public static void main(String[] args){
        ExportHeaderModel exportHeaderModel = new ExportHeaderModel();
        exportHeaderModel.setDepId("一分公司");
        exportHeaderModel.setExportDate("2010-05-18");
        Map<String, Collection<ExportDataModel>> mapData =
                new HashMap<>();
        Collection<ExportDataModel> collection = new ArrayList<>();
        ExportDataModel exportDataModel1 = new ExportDataModel();
        exportDataModel1.setProductId("产品 001 号");
        exportDataModel1.setPrice(100);
        exportDataModel1.setAmount(80);

        ExportDataModel exportDataModel2 = new ExportDataModel();
        exportDataModel2.setProductId("产品 002 号");
        exportDataModel2.setPrice(200);
        exportDataModel2.setAmount(160);

        collection.add(exportDataModel1);
        collection.add(exportDataModel2);

        mapData.put("销售记录", collection);

        ExportFooterModel exportFooterModel = new ExportFooterModel();
        exportFooterModel.setExportUser("张三");

        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct(exportHeaderModel, mapData, exportFooterModel);

        System.out.println("输出到文本文件内容：\n" + textBuilder.getBuffer());

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director1 = new Director(xmlBuilder);
        director1.construct(exportHeaderModel, mapData, exportFooterModel);
        System.out.println("输出到xml文件内容：\n" + xmlBuilder.getBuffer());



    }



}
