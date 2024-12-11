package com.example.finalmedieval;

public class Stats {
    // Constant (Final) Variables
    static double DEFAULT_DEFENSE = 0.0;
    static double DEFAULT_ATTACK_POWER = 0.0;
    static double DEFAULT_HEALTH = 0.0;

    // Instance Variables
    private double defense;
    private double attackPower;
    private double health;

    // Constructors
    public Stats(double defense, double attackPower, double health) {

    }

    public Stats() {
        this(Stats.DEFAULT_DEFENSE, Stats.DEFAULT_ATTACK_POWER, Stats.DEFAULT_HEALTH);
    }


    // Adds Defense Depending on Armor
    public void setDefense(double value) {
        if (Main.currentCharacterIndex == Main.humanStaffCloth) {
            this.defense = 1.0;
        } else if (Main.currentCharacterIndex == Main.humanLeatherStaff) {
            this.defense = 2.0;
        } else if (Main.currentCharacterIndex == Main.humanHeavyStaff) {
            this.defense = 3.0;
        } else if (Main.currentCharacterIndex == Main.humanClothDaggers) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.humanLeatherDaggers) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.humanHeavyDaggers) {
            this.defense = 3.3;
        } else if (Main.currentCharacterIndex == Main.humanClothSword) {
            this.defense = 1.8;
        } else if (Main.currentCharacterIndex == Main.humanLeatherSword) {
            this.defense = 2.8;
        } else if (Main.currentCharacterIndex == Main.humanHeavySword) {
            this.defense = 3.8;
        } else if (Main.currentCharacterIndex == Main.humanClothAxe) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.humanLeatherAxe) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.humanHeavyAxe) {
            this.defense = 3.3;
        } else if (Main.currentCharacterIndex == Main.elfClothStaff) {
            this.defense = 1.0;
        } else if (Main.currentCharacterIndex == Main.elfLeatherStaff) {
            this.defense = 2.0;
        } else if (Main.currentCharacterIndex == Main.elfHeavyStaff) {
            this.defense = 3.0;
        } else if (Main.currentCharacterIndex == Main.elfClothDaggers) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.elfLeatherDaggers) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.elfHeavyDaggers) {
            this.defense = 3.3;
        } else if (Main.currentCharacterIndex == Main.elfClothSword) {
            this.defense = 1.8;
        } else if (Main.currentCharacterIndex == Main.elfLeatherSword) {
            this.defense = 2.8;
        } else if (Main.currentCharacterIndex == Main.elfHeavySword) {
            this.defense = 3.8;
        } else if (Main.currentCharacterIndex == Main.elfClothAxe) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.elfLeatherAxe) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.elfHeavyAxe) {
            this.defense = 3.3;
        } else if (Main.currentCharacterIndex == Main.orcClothStaff) {
            this.defense = 1.0;
        } else if (Main.currentCharacterIndex == Main.orcLeatherStaff) {
            this.defense = 2.0;
        } else if (Main.currentCharacterIndex == Main.orcHeavyStaff) {
            this.defense = 3.0;
        } else if (Main.currentCharacterIndex == Main.orcClothDaggers) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.orcLeatherDaggers) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.orcHeavyDaggers) {
            this.defense = 3.3;
        } else if (Main.currentCharacterIndex == Main.orcClothSword) {
            this.defense = 1.8;
        } else if (Main.currentCharacterIndex == Main.orcLeatherSword) {
            this.defense = 2.8;
        } else if (Main.currentCharacterIndex == Main.orcHeavySword) {
            this.defense = 3.8;
        } else if (Main.currentCharacterIndex == Main.orcClothAxe) {
            this.defense = 1.3;
        } else if (Main.currentCharacterIndex == Main.orcLeatherAxe) {
            this.defense = 2.3;
        } else if (Main.currentCharacterIndex == Main.orcHeavyAxe) {
            this.defense = 3.3;
        }

    }

    // Adds attackPower Depending On Weapon
    public void setAttackPower(double attackPower) {
        if (Main.currentCharacterIndex == Main.humanStaffCloth) {
            this.attackPower = 4.0;
        } else if (Main.currentCharacterIndex == Main.humanLeatherStaff) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.humanHeavyStaff) {
            this.attackPower = 1.8;
        } else if (Main.currentCharacterIndex == Main.humanClothDaggers) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.humanLeatherDaggers) {
            this.attackPower = 3.0;
        } else if (Main.currentCharacterIndex == Main.humanHeavyDaggers) {
            this.attackPower = 2.0;
        } else if (Main.currentCharacterIndex == Main.humanClothSword) {
            this.attackPower = 2.2;
        } else if (Main.currentCharacterIndex == Main.humanLeatherSword) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.humanHeavySword) {
            this.attackPower = 2.7;
        } else if (Main.currentCharacterIndex == Main.humanClothAxe) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.humanLeatherAxe) {
            this.attackPower = 2.6;
        } else if (Main.currentCharacterIndex == Main.humanHeavyAxe) {
            this.attackPower = 3.0;
        } else if (Main.currentCharacterIndex == Main.orcClothStaff) {
            this.attackPower = 4.0;
        } else if (Main.currentCharacterIndex == Main.orcLeatherStaff) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.orcHeavyStaff) {
            this.attackPower = 1.8;
        } else if (Main.currentCharacterIndex == Main.orcClothDaggers) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.orcLeatherDaggers) {
            this.attackPower = 3.0;
        } else if (Main.currentCharacterIndex == Main.orcHeavyDaggers) {
            this.attackPower = 2.0;
        } else if (Main.currentCharacterIndex == Main.orcClothSword) {
            this.attackPower = 2.2;
        } else if (Main.currentCharacterIndex == Main.orcLeatherSword) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.orcHeavySword) {
            this.attackPower = 2.7;
        } else if (Main.currentCharacterIndex == Main.orcClothAxe) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.orcLeatherAxe) {
            this.attackPower = 2.6;
        } else if (Main.currentCharacterIndex == Main.orcHeavyAxe) {
            this.attackPower = 3.0;
        } else if (Main.currentCharacterIndex == Main.elfClothStaff) {
            this.attackPower = 4.0;
        } else if (Main.currentCharacterIndex == Main.elfLeatherStaff) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.elfHeavyStaff) {
            this.attackPower = 1.8;
        } else if (Main.currentCharacterIndex == Main.elfClothDaggers) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.elfLeatherDaggers) {
            this.attackPower = 3.0;
        } else if (Main.currentCharacterIndex == Main.elfHeavyDaggers) {
            this.attackPower = 2.0;
        } else if (Main.currentCharacterIndex == Main.elfClothSword) {
            this.attackPower = 2.2;
        } else if (Main.currentCharacterIndex == Main.elfLeatherSword) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.elfHeavySword) {
            this.attackPower = 2.7;
        } else if (Main.currentCharacterIndex == Main.elfClothAxe) {
            this.attackPower = 2.4;
        } else if (Main.currentCharacterIndex == Main.elfLeatherAxe) {
            this.attackPower = 2.6;
        } else if (Main.currentCharacterIndex == Main.elfHeavyAxe) {
            this.attackPower = 3.0;
        }
    }

    public void setHealth(double health) {
        if (Main.currentCharacterIndex == Main.humanStaffCloth) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanLeatherStaff) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanHeavyStaff) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanClothDaggers) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanLeatherDaggers) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanHeavyDaggers) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanClothSword) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.humanLeatherSword) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.humanHeavySword) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.humanClothAxe) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanLeatherAxe) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.humanHeavyAxe) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.orcClothStaff) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcLeatherStaff) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcHeavyStaff) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcClothDaggers) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcLeatherDaggers) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcHeavyDaggers) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcClothSword) {
            this.health = 110;
        } else if (Main.currentCharacterIndex == Main.orcLeatherSword) {
            this.health = 110;
        } else if (Main.currentCharacterIndex == Main.orcHeavySword) {
            this.health = 110;
        } else if (Main.currentCharacterIndex == Main.orcClothAxe) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcLeatherAxe) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.orcHeavyAxe) {
            this.health = 105;
        } else if (Main.currentCharacterIndex == Main.elfClothStaff) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfLeatherStaff) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfHeavyStaff) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfClothDaggers) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfLeatherDaggers) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfHeavyDaggers) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfClothSword) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.elfLeatherSword) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.elfHeavySword) {
            this.health = 100;
        } else if (Main.currentCharacterIndex == Main.elfClothAxe) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfLeatherAxe) {
            this.health = 95;
        } else if (Main.currentCharacterIndex == Main.elfHeavyAxe) {
            this.health = 95;
        }
    }

    // setAll Method
    public void setAll(double defense, double attackPower, double health) {
        this.setDefense(defense);
        this.setAttackPower(attackPower);
        this.setHealth(health);
    }

    // Getters
    public double getDefense() {
        return this.defense;
    }

    public double getAttackPower() {
        return this.attackPower;
    }

    public double getHealth() {
        return this.health;
    }

    // toString
    @Override
    public String toString() {
        return "Your stats are: \nDefense: " + this.defense + "\nattackPower: " + this.attackPower + "\nHealth: " + this.health;
    }

    // equals method
    @Override
    public boolean equals(Object other) {
        if (other == null || (!(other instanceof Stats))) {
            return false;
        } else {
            Stats otherStats = (Stats) other;
            return true;
        }
    }
}



