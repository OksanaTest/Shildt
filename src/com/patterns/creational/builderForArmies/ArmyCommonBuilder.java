package com.patterns.creational.builderForArmies;

public abstract class ArmyCommonBuilder extends Army{
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
