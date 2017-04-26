package com.patterns.creational.builderForArmies;

import java.util.Arrays;

public class Army {
    private EntitiesArmies[] entitiesArmies;
    private NameArmy nameArmy;

    public void setEntitiesArmies(EntitiesArmies[] entitiesArmies) {
        this.entitiesArmies = entitiesArmies;
    }

    public void setNameArmy(NameArmy nameArmy) {
        this.nameArmy = nameArmy;
    }

    @Override
    public String toString() {
        return "Army{" +
                "entitiesArmies=" + Arrays.toString(entitiesArmies) +
                ", nameArmy=" + nameArmy +
                '}';
    }
}
