package com.patterns.creational.builderG;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise Web Site");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CSM.ALIFPRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(2000);
    }
}
