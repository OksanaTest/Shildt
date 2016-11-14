package com.patterns.builderGenya;

public abstract class WebSiteBuilder {
    WebSite webSite;

    void createWebsite(){
        webSite =  new WebSite();
    }
    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    WebSite getWebSite(){
        return webSite;
    }
}
