package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

import java.util.Collection;
import java.util.Map;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 下午12:56
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(ExportHeaderModel exportHeaderModel,
                          Map<String, Collection<ExportDataModel>> mapData,
                          ExportFooterModel exportFooterModel){
        builder.buildHeader(exportHeaderModel);
        builder.buildBody(mapData);
        builder.buildFooter(exportFooterModel);
    }

}
