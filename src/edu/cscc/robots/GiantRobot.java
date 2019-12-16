package edu.cscc.robots;

import edu.cscc.equipment.Equippable;

/**
 * TODO Implement the FightingRobot interface.
 * See the README for how each method should be implemented.
 */
public class GiantRobot extends AbstractRobot implements FightingRobot {

    public GiantRobot(String name, int health) {
        super(name, health);
    }

    private Equippable equippable;

    @Override
    public void equip(Equippable equippable) {
        this.equippable = equippable;
    }

    @Override
    public void attack(FightingRobot opponent) {
        AttackStrategy fight = new AttackStrategy();
        fight.attack(opponent, equippable);
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isDestroyed() {
        return health <= 0;
    }

    class AttackStrategy {

        public void attack(FightingRobot opponent, Equippable equippable) {
            System.out.println(name + " attacks with " + equippable.getName() + "!");
            System.out.println(equippable.soundEffect());
            int damage = equippable.damage();
            System.out.println(opponent.getName() + " takes " + damage + " points of damage!");
            opponent.takeDamage(damage);
        }
    }
}
