package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monsterek implements iSave {
    private String monster;
    private int health;
    private int power;

    public Monsterek(String monster, int health, int power) {
        this.monster = monster;
        this.health = health;
        this.power = power;
    }

    public String getMonster() {
        return monster;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Monsterek{" +
                "monster='" + monster + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.monster);
        values.add(1, "" + this.health);
        values.add(2, "" + this.power);
        return values;


    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.monster = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.power = Integer.parseInt(savedValues.get(2));
        }
    }
}
