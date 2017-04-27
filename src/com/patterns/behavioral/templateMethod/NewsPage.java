package com.patterns.behavioral.templateMethod;

public class NewsPage extends WebSiteTemplate{
    @Override
    public void showContent() {
        System.out.println("News");
    }
}
