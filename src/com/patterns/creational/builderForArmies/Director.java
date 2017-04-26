package com.patterns.creational.builderForArmies;

public class Director {
    ArmyCommonBuilder armyCommonBuilder;

    public void setArmyCommonBuilder(ArmyCommonBuilder armyCommonBuilder){
        this.armyCommonBuilder = armyCommonBuilder;
    }
    Army buildArmy(){
        armyCommonBuilder.createArmy();
        armyCommonBuilder.buildName();
        armyCommonBuilder.buildEntitiesArmies();
        return armyCommonBuilder.getArmy();
    }
}
