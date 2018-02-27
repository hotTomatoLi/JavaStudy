package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

import java.util.Collection;
import java.util.Map;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 下午1:05
 */
public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel exportHeaderModel) {
        buffer.append(exportHeaderModel.getDepId() + "," + exportHeaderModel.getExportDate() +"\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String key : mapData.keySet()){
            buffer.append(key + "\n");
            for(ExportDataModel exportDataModel : mapData.get(key)){
                buffer.append(exportDataModel.getProductId() + "," + exportDataModel.getPrice()
                + "," + exportDataModel.getAmount() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel exportFooterModel) {
        buffer.append(exportFooterModel.getExportUser());
    }

    public StringBuffer getBuffer() {
        return buffer;
    }
}
