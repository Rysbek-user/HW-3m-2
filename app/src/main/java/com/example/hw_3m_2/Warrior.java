package com.example.hw_3m_2;

import java.io.Serializable;

public class Warrior implements Serializable {
    public String name;
    public int level;
    public String weapon;

    public Warrior(String name, int level, String weapon) {
        this.name = name;
        this.level = level;
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public String getWeapon() {
        return weapon;
    }


}
