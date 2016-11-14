package com.patterns.builderGenya;

public class BuilderWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setWebSiteBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);

        director.setWebSiteBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite1 = director.buildWebSite();
        System.out.println(webSite1);


    }
}
