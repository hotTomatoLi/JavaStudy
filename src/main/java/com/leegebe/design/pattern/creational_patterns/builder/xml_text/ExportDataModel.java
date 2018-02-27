package com.leegebe.design.pattern.creational_patterns.builder.xml_text;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 下午1:00
 */
public class ExportDataModel {

    private String productId;

    private double price;

    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
