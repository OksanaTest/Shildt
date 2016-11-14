package com.patterns.builderForArmies;

public class ArmyBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setArmyCommonBuilder(new RomeArmy());
        System.out.println("Rome army " + director.buildArmy());

        director.setArmyCommonBuilder(new CarfagenArmy());
        System.out.println("Carfagen army" + director.buildArmy());

    }
}
