## Interfaces and Inner Classes Exercise
This exercise involves implementing interfaces and using inner classes 
in order to become familiar with their usage.

## Description
In this exercise we will complete a program which simulates combat between two giant robots. 
Each robot has a name, health, and can equip a weapon. A Main class (under `edu.cscc.Main`) has been created to simulate
the combat.

## Tasks
1. Read through the project to become familiar with the code.
2. Try running the `Main.main()` method, and notice that the project does not compile.
3. Find the `FightingRobot` interface. This interface has several methods on it that need to be 
implemented by a class. These methods include:
    - `void equip(Equippable equippable)`
    - `void attack(FightingRobot fightingRobot)`
    - `void takeDamage(int amount)`
    - `String getName()`
    - `boolean isDestroyed()`
4. Find the `GiantRobot` class and update it to implement the `FightingRobot` interface with the following implementations:
    - `equip`: Set the `equippable` parameter as a property of the class.
    - `attack`: Find the inner class `AttackStrategy` on `GiantRobot`. Create a new instance of the strategy
    and invoke the `attack` method.
    - `takeDamage`: Subtract the `damage` parameter from the `health` of the `GiantRobot`.
    - `getName`: Return the name of the `GiantRobot`.
    - `isDestroyed`: Return `true` if `health` is less than or equal to 0, false otherwise.
5. Run the `Main.main()` method again. The program should compile and you should see output in the console.

## Bonus
- Create your own class which implements the `Equippable` interface and have one of the robots in
`Main.main()` equip it instead of the `EnergySword`.