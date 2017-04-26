package com.patterns.creational.builderG;

public class Director {
    WebSiteBuilder webSiteBuilder;

    public void setWebSiteBuilder (WebSiteBuilder webSiteBuilder){
        this.webSiteBuilder = webSiteBuilder;
    }
    WebSite buildWebSite(){
        webSiteBuilder.createWebsite();
        webSiteBuilder.buildName();
        webSiteBuilder.buildCMS();
        webSiteBuilder.buildPrice();

        WebSite website = webSiteBuilder.getWebSite();
        return website;
    }
}
