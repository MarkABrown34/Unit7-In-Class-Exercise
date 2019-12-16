package edu.cscc.robots;

/**
 * Base class which hold a couple of properties.
 * No need to do anything here.
 */
public abstract class AbstractRobot {
    protected String name;
    protected int health;

    public AbstractRobot(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
}
