package com.patterns.structural.proxyG;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://somerealproject.test");

        project.run();
    }
}
