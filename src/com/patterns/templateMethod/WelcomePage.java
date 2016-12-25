package com.patterns.templateMethod;

public class WelcomePage extends WebSiteTemplate{

    @Override
    public void showContent() {
        System.out.println("Welcome");
    }
}
