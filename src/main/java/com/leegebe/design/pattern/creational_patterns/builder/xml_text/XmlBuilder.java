package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

import java.util.Collection;
import java.util.Map;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 下午1:08
 */
public class XmlBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel exportHeaderModel) {
        buffer.append("<xml>\n");
        buffer.append("<Report>\n");
        buffer.append("<Header>\n");
        buffer.append("  <DepId>" + exportHeaderModel.getDepId() + "</DepId>\n");
        buffer.append("  <ExportDate>" + exportHeaderModel.getExportDate() + "</ExportDate>\n");
        buffer.append("</Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append(" <Body>\n");
        for(String key : mapData.keySet()){
            buffer.append("<Datas TableName=\"" + key + "\">\n");
            for(ExportDataModel exportDataModel : mapData.get(key)){
                buffer.append("  <Data>\n");
                buffer.append("  <ProductId>" + exportDataModel.getProductId() + "</ProductId>\n");
                buffer.append("  <Price>" + exportDataModel.getPrice() + "</Price>\n");
                buffer.append("  <Amount>" + exportDataModel.getAmount() + "</Amount>\n");
                buffer.append("  </Data>\n");
            }
            buffer.append("  </Datas>\n");
        }
    }

    @Override
    public void buildFooter(ExportFooterModel exportFooterModel) {
        buffer.append("  <Footer>\n");
        buffer.append("  <ExportUser>" + exportFooterModel.getExportUser() + "</ExportUser>\n");
        buffer.append("<Footer>\n");
        buffer.append("<Report>\n");
    }

    public StringBuffer getBuffer() {
        return buffer;
    }
}
