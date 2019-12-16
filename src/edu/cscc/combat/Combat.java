package edu.cscc.combat;

import edu.cscc.robots.FightingRobot;

import java.util.Random;

/**
 * Combat simulation. No need to do anything here.
 */
public class Combat {
    public static boolean engageCombat(FightingRobot firstRobot, FightingRobot secondRobot) {
        boolean shouldAttack = new Random().nextInt() % 2 == 0;
        if (shouldAttack) {
            firstRobot.attack(secondRobot);
            if (secondRobot.isDestroyed()) {
                System.out.println(firstRobot.getName() + " won!");
                return true;
            }
        } else {
            System.out.println(firstRobot.getName() + " flies around!");
        }
        return false;
    }
}
