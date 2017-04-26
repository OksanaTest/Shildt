package com.patterns.creational.builderG;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit Card");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CSM.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
