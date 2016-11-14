package com.patterns.builderForArmies;

public class CarfagenArmy extends ArmyCommonBuilder
{
    @Override
    void buildName() {
        army.setNameArmy(NameArmy.CARFAGEN);
    }

    @Override
    void buildEntitiesArmies() {
        EntitiesArmies array[] = new EntitiesArmies[4];
        array[0] = EntitiesArmies.INFANTRYMAN;
        array[1] = EntitiesArmies.ARCHER;
        array[2] = EntitiesArmies.ELEPHANT;
        array[3] = EntitiesArmies.HORSEMAN;
        army.setEntitiesArmies(array);
    }
}
