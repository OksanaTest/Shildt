package com.patterns.builderForArmies;

public abstract class ArmyCommonBuilder{
    Army army;

    void createArmy(){
        army = new Army();
    }
    abstract void buildName();
    abstract void buildEntitiesArmies();

    Army getArmy(){
        return army;
    };
}
