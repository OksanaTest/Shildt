package com.patterns.creational.builderG;

public class WebSite {
    private String name;
    private CSM cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(CSM cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name = '" + name + '\'' +
                ", cms = " + cms +
                ", price = " + price +
                '}';
    }
}
