package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyDirector {

    private final EnemyBuilder builder;

    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy createMinion(EnemyComponentFactory factory) {
        return builder
                .setName("Minion")
                .setHealth(100)
                .setDamage(20)
                .setDefense(10)
                .setSpeed(15)
                .setElement("NONE")
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();  // Factory Method
    }

    public Enemy createElite(EnemyComponentFactory factory) {
        return builder
                .setName("Elite")
                .setHealth(300)
                .setDamage(60)
                .setDefense(40)
                .setSpeed(25)
                .setElement("NONE")
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createMiniBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Mini Boss")
                .setHealth(2000)
                .setDamage(200)
                .setDefense(100)
                .setSpeed(35)
                .setElement(factory.getElement())
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .addPhase(1, 2000)
                .addPhase(2, 1000)
                .build();
    }
    public Enemy createRaidBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Raid Boss")
                .setHealth(10000)
                .setDamage(1000)
                .setDefense(400)
                .setSpeed(40)
                .setElement(factory.getElement())
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .addPhase(1, 10000)
                .addPhase(2, 5000)
                .addPhase(3, 2500)
                .build();
    }
}