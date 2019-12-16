package edu.cscc;

import edu.cscc.combat.Combat;
import edu.cscc.equipment.EnergySword;
import edu.cscc.robots.FightingRobot;
import edu.cscc.robots.GiantRobot;

public class Main {

    public static void main(String[] args) {
        //TODO Update GiantRobot to implement the FightingRobot interface.
        FightingRobot firstRobot = new GiantRobot("Gundam", 100);
        firstRobot.equip(new EnergySword());

        FightingRobot secondRobot = new GiantRobot("Veritech", 100);
        secondRobot.equip(new EnergySword());
        //TODO Bonus: Create your own class which implements the Equippable interface.
        //Have one of the robots equip it instead of the EnergySword.

        while(true) {
            if (Combat.engageCombat(firstRobot, secondRobot)) break;
            if (Combat.engageCombat(secondRobot, firstRobot)) break;
        }
    }
}
