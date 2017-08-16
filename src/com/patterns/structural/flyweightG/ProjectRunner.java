package com.patterns.structural.flyweightG;


import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloperBySpecialty("JavaDeveloper"));
        developerList.add(developerFactory.getDeveloperBySpecialty("JavaDeveloper"));
        developerList.add(developerFactory.getDeveloperBySpecialty("JavaDeveloper"));
        developerList.add(developerFactory.getDeveloperBySpecialty("JavaDeveloper"));

        developerList.add(developerFactory.getDeveloperBySpecialty("CppDeveloper"));
        developerList.add(developerFactory.getDeveloperBySpecialty("CppDeveloper"));
        developerList.add(developerFactory.getDeveloperBySpecialty("CppDeveloper"));

        for(Developer dev: developerList ){
            dev.writeCode();
        }

    }
}
