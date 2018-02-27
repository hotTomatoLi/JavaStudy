package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

import java.util.Collection;
import java.util.Map;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 上午11:49
 */
public interface Builder {

    void buildHeader(ExportHeaderModel exportHeaderModel);

    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    void buildFooter(ExportFooterModel exportFooterModel);

}
