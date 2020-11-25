package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements iSave {
    private String player;
    private int health;
    private int power;
    private String weapon;

    public Player(String player, int health, int power) {
        this.player = player;
        this.health = health;
        this.power = power;
        this.weapon = "Sword";
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                ", health=" + health +
                ", power=" + power +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.player);
        values.add(1, "" + this.health);
        values.add(2, "" + this.power);
        values.add(3, "" + this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
    if(savedValues != null && savedValues.size() > 0){
        this.player = savedValues.get(0);
        this.health = Integer.parseInt(savedValues.get(1));
        this.power = Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);


    }
    }
}
