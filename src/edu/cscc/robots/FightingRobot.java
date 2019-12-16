package edu.cscc.robots;

import edu.cscc.equipment.Equippable;

public interface FightingRobot {
    //Equips equippable weapon.
    void equip(Equippable equippable);

    //Attack the opponent fighting robot.
    void attack(FightingRobot opponent);

    //Takes damage equal to amount.
    void takeDamage(int amount);

    //Get the name of the FightingRobot.
    String getName();

    //Determine if the FightingRobot is destroyed or not.
    boolean isDestroyed();
}
