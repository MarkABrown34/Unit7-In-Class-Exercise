package edu.cscc.equipment;

/**
 * This class implements the Equippable interface.
 * No need to do anything here.
 */
public class EnergySword implements Equippable {

    @Override
    public String getName() {
        return "Energy Sword";
    }

    @Override
    public String soundEffect() {
        return "Zwoosh!";
    }

    @Override
    public int damage() {
        return 15;
    }
}
